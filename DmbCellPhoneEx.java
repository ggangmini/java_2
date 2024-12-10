public class DmbCellPhoneEx {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        cellPhone.powerOn();
        cellPhone.bell();
        cellPhone.sendVoice("안녕하세요~~");
        cellPhone.receiveVoice("누구신가요??");
        cellPhone.sendVoice("길동이 폰 아닌가요??");
        cellPhone.receiveVoice("아닙니다.");
        cellPhone.hangUp();
        cellPhone.powerOff();

        System.out.println();

        DmbCellPhone dmbCellPhone = new DmbCellPhone("하이","하이",11);
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(11);
        dmbCellPhone.turnOffDmb();
        dmbCellPhone.powerOn();
        dmbCellPhone.sendVoice("안녕하세요");
    }
}
