package Homework8.MiniDataBase;

import Homework3.Group;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MiniDataBase implements Serializable {
    private List<Group> groupList;

    public MiniDataBase() {
        groupList = new ArrayList<>();
    }

    public void addGroup(Group group) {
        if (groupList.contains(group)) {
            System.out.println("This group is already in the list");
        } else {
            groupList.add(group);
        }
    }

    public void delete(Group group) {
        groupList.remove(group);
    }

    public Group get(String groupName) {

        for (Group group : groupList) {
            if (groupName.equals(group.getGroupName())) {
                return group;
            }
        }
        return null;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void saveBase(String pathName) {

        try (ObjectOutputStream stream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(pathName)))) {
            stream.writeObject(this);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public MiniDataBase loadBase(String pathName) {
        MiniDataBase base;
        try (ObjectInputStream stream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(pathName)))) {
            base = (MiniDataBase) stream.readObject();
            return base;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
