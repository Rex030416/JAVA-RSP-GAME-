import java.util.Random;

class AIbot extends Bot{
    protected int i1,i2,i3;
    public AIbot(String name) {
        super(name);
        this.i1=0;
        this.i2=0;
        this.i3=0;
    }

    public void move(int[] arr,int playerchoice)
    {
        int i;
        int []choicearr={1,2,3};
        for (i=0;i<arr.length;i++)
        {
            if (arr[i]==1)
            {
                i1++;
            }
            if (arr[i]==2)
            {
                i2++;
            }
            if (arr[i]==3)
            {
                i3++;
            }
        }
        int []weight={i1,i2,i3};
        int totalweight=i1+i2+i3;
        int cumulativeweight=0;
        int randomValue = new Random().nextInt() * totalweight;
        for (int j = 0; j < choicearr.length; j++) {
            cumulativeweight += weight[j];
            if (randomValue < cumulativeweight) {
                choice=choicearr[j];
            }
        }




    }






}
