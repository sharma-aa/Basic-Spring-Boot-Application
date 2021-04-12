package com.example.firstspringapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private PlayerService players;

    @RequestMapping("/allPlayers")
    public List<Player> all_players(){
        return players.all_players();
    }

    @RequestMapping("/Player/{id}")
    public Player get_player(@PathVariable int id){
        return players.get_player(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/Player")
    public void put_player(@RequestBody Player new_player){
        players.add_player(new_player);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/Player/{id}")
    public void update_player(@RequestBody Player p, @PathVariable int id){
        players.update_player(p, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/Player/{id}")
    public void delete_player(@PathVariable int id){
        players.remove_player(id);
    }
}
