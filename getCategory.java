public class getCategory {
    Stages usr;

    public void decisionCateg(int sys, int dias){
        if(sys < 120 && dias < 80){
            usr = Stages.NORMAL;
        }
        else if(sys >= 120 && sys <= 129 && dias <= 80){
            usr = Stages.ELEVATED;
        }
        else if(sys >= 130 && sys <= 139 && dias >=80 && dias <=89){
            usr = Stages.STAGE1;
        }
        else if(sys >= 140 && sys <= 179 && dias >= 90 && dias <= 119){
            usr = Stages.STAGE2;
        }
        else if(sys >= 180 && dias >= 120){
            usr = Stages.HYPERTENSIVE_CRISIS;
        }
        else{
            System.out.println("Out of scales range");
        }
    }

    public void classifyCateg(){
        switch(usr.ordinal()){
            case 0:
                System.out.println(usr.toString());
                System.out.println("Your blood pressure is normal");
                System.out.println();
                break;
            case 1:
                System.out.println(usr.toString());
                System.out.println("Your blood pressure is elevated, \nyou might wanna take a rest");
                System.out.println();
                break;
            case 2:
                System.out.println(usr.toString());
                System.out.println("Hypertension stage 1, seek medical attention if can");
                System.out.println();
                break;
            case 3:
                System.out.println(usr.toString());
                System.out.println("Hypertension stage 2, seek medical attention immediately");
                System.out.println();
                break;
            case 4:
                System.out.println(usr.toString());
                System.out.println("Bro, how are you even able to use this at this point");
                System.out.println();
        }
    }
}

enum Stages{
    NORMAL, ELEVATED, STAGE1, STAGE2, HYPERTENSIVE_CRISIS;
}