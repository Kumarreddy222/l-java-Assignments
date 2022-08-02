class Assigment1
{

    public static void main(String args[])
    {
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 1; j <= 7; j++)
            {
                if (i == 1 || j == 4)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }

            System.out.println();
        }

        System.out.println();


        for (int k = 1; k <= 7; k++)
        {
            for (int l = 1; l <= 7; l++)
            {
                if (k == 1 || k == 4 || k == 7 || l == 1)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }

            System.out.println();
        }

        System.out.println();

        for (int m = 1; m <= 7; m++)
        {
            for (int n = 1; n <= 7; n++)
            {
                if (m == 7 || n == 1)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int o = 1; o <= 7; o++)
        {
            for (int p = 1; p <= 7; p++)
            {
                if (o == 7 || p == 1 || p == 7)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int q = 1; q <= 7; q++)
        {
            for (int r = 1; r <= 7; r++)
            {
                if(q==1 ||  q==2 && r==1 || q==3 && r==1 || q ==4 || q ==5 && r==7 ||  q ==6 && r==7 || q==7)


                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int s = 1; s <= 7; s++)
        {
            for (int t = 1; t <= 7; t++)
            {
                if ( t == 1 || s ==1 && t ==4 || s ==2 && t==3 || s ==3 && t ==2 || s ==5 && t ==2 || s == 6 && t ==3
                || s ==7 && t == 4)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println();

        for (int u = 1; u <= 7; u++)
        {
            for (int v = 1; v <= 7; v++)
            {
                if (u== 1 || u == 7 || v == 1 || v == 7)
                {
                    System.out.print("* ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }



}