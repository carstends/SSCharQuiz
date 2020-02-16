package com.example.sscharquiz;

import android.app.Application;
import android.net.Uri;

import java.util.LinkedList;
import java.util.List;

import com.example.sscharquiz.R;


//Application wide container for list of players
public class PlayerList extends Application {

    private List<Player> list;

    public PlayerList(){

        list = new LinkedList<>();

    }
    //initializing with two characters
    public void init(){
        Uri uri1 = Uri.parse("android.resource://com.example.sscharquiz/"+ R.drawable.kingk);
        Uri uri2 = Uri.parse("android.resource://com.example.sscharquiz/"+R.drawable.megaman);
        Player p1 = new Player("king k rool", uri1.toString());
        p1.setFromGallery(true);
        Player p2 = new Player("megaman", uri2.toString());
        p2.setFromGallery(true);
        appendPlayer(p1);
        appendPlayer(p2);
    }

    public void appendPlayer(Player p){
        list.add(p);
    }
    public void removePlayer(Player p){
        list.remove(p);
    }
    public void setList(List<Player> l){
        list = l;
    }
    public List<Player> getList(){
        return list;
    }
}
