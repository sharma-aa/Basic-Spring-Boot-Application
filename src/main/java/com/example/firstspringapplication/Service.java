package com.example.firstspringapplication;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.stereotype.Service
class PlayerService {
    List<Player> players = new ArrayList<>(Arrays.asList(new Player(7, "Cristiano Ronaldo", "Juventus", "Portugal"),
            new Player(10, "Lionel Messi", "Barcelona", "Argentina"),
            new Player(2, "Zinedin Zidane", "Real Madrid", "France"),
            new Player(1, "Pele", "Santos", "Brazil"),
            new Player(8, "Toni Kroos", "Real Madrid", "Germany")));

    public List<Player> all_players(){
        return players;
    }

    public Player get_player(int id) {
        return players.stream().filter(p -> p.getId().equals(id)).findFirst().get();
    }

    public void add_player(Player new_player) {
        players.add(new_player);
    }

    public void update_player(Player p, int id) {
        for(int i = 0; i < players.size(); i++){
            Player player = players.get(i);
            if (player.getId() == id){
                players.set(i, p);
                return;
            }
        }
    }

    public void remove_player(int id) {
        players.removeIf(p -> p.getId().equals(id));
    }
}
