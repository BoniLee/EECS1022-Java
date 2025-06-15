package Test3;

import java.util.Arrays;


public class HouseCarpet {
	private RoomDimension[] rooms;
	private double cost;
	
	//getCarpetCost
	public double getCarpetCost() {
		double totalCost=0;
		for(RoomDimension room: rooms) {
			if(room!=null) {
				totalCost+=room.getArea()*cost;	
			}
		}
		return totalCost;
	}
	//getRoomCosts
	public double[] getRoomCosts() {
		double[] roomCosts=new double[rooms.length];
		for(int i=0;i<rooms.length;i++) {
			if(rooms[i]!=null) {
				roomCosts[i] = rooms[i].getArea() * cost;		
			}
		}
		return roomCosts;
	}
	//setRooms
	public void setRooms(RoomDimension[] roomArray) {
        if (roomArray.length != rooms.length) {
            rooms = new RoomDimension[roomArray.length];
        }
        for (int i = 0; i < roomArray.length; i++) {
            rooms[i] = roomArray[i];
        }
    }
	//Constructor 
	public HouseCarpet(RoomDimension[] rooms, double cost) {
		this.rooms = rooms;
		this.cost = cost;
	}
	//isFanSuitable
	 public int isFanSuitable(Fan fan) {
	        int count = 0;
	        for (RoomDimension room : rooms) {
	            if (room != null && room.isFanSuitable(fan)) {
	                count++;
	            }
	        }
	        return count;
	    }
	//
	 @Override
		public String toString() {
			return "HouseCarpet [rooms=" + Arrays.toString(rooms) + ", cost=" + cost + "]";
		}
	

	public static void main(String[] args) {
		    RoomDimension room1 = new RoomDimension(12, 15);
	        RoomDimension room2 = new RoomDimension(10, 10);
	        RoomDimension room3 = new RoomDimension(14, 10);

	        RoomDimension[] rooms = {room1, room2, room3};

	        HouseCarpet houseCarpet = new HouseCarpet(rooms, 5.0);

	        System.out.println("Total Carpet Cost: " + houseCarpet.getCarpetCost());
	        System.out.println("Room Costs: " + Arrays.toString(houseCarpet.getRoomCosts()));
	        System.out.println(houseCarpet);
	    }
	}

	
