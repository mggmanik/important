public class Room {

    private int isRoomNo;
    private String roomType;
    private double roomArea;
    private boolean acMachine;

    public int getIsRoomNo() {
        return isRoomNo;
    }

    public void setIsRoomNo(int isRoomNo) {
        this.isRoomNo = isRoomNo;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public boolean isAcMachine() {
        return acMachine;
    }

    public void setAcMachine(boolean acMachine) {
        this.acMachine = acMachine;
    }

    public void setData(int roomNo, String roomType, double roomArea, boolean acMachine)
    {
        this.isRoomNo = roomNo;
        this.roomType = roomType;
        this.roomArea = roomArea;
        this.acMachine = acMachine;
    }

    public void displayData()
    {
        System.out.println(isRoomNo);
        System.out.println(roomType);
        System.out.println(roomArea);
        System.out.println(acMachine);
    }

    public static void main(String[] args) {
        Room r = new Room();
        r.setData(24,"Luxury Suit",2500.45,true);
        r.displayData();

//        r.setIsRoomNo(24);
//        r.setRoomType("Luxury Suit");
//        r.setRoomArea(2500.45);
//        r.setAcMachine(true);
//
//        System.out.println(r.getIsRoomNo());
//        System.out.println(r.getRoomType());
//        System.out.println(r.getRoomArea());
//        System.out.println(r.isAcMachine());
    }
}
