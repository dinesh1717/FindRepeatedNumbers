package com.workshop;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class BirdsRepository {
    //private List<Bird> birdsList = new ArrayList();
    private Set<Bird> listBirds = new HashSet<Bird>();

    Set getListBirds() {
        return listBirds;
    }

    public void addBird(Bird bird) {
        listBirds.add(bird);
    }

    public void removeBird(Bird bird) {
        listBirds.remove(bird);
    }

    Bird getBirdId(String birdId) {
        Iterator<Bird> iterator = listBirds.iterator();
        while(iterator.hasNext()) {
            Bird b = iterator.next();
            if(b.birdId.equalsIgnoreCase(birdId)) {
                return b;
            }
        }
        return null;
    }

}
