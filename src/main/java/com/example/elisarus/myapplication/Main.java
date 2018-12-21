import java.util.Scanner;

        public class Main {






            double inputMatrix() {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                int y = scan.nextInt();
                float[][] array1 = new float[x][y];

                int z = scan.nextInt();
                int c = scan.nextInt();
                float[][] array2 = new float[z][c];

                System.out.println("Введите матрицу 1");
                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array1[k].length; i++) {

                        array1[k][i] = scan.nextFloat();
                    }
                }
                System.out.println("Введите матрицу 2");

                for (int k = 0; k < array2.length; k++) {
                    for (int i = 0; i < array2[k].length; i++) {

                        array2[k][i] = scan.nextFloat();
                    }
                }
                System.out.println("Первая матрица");
                for (int k = 0; k < x; k++) {
                    for (int i = 0; i < y; i++) {
                        System.out.print(array1[k][i] + "  ");
                    }
                    System.out.println();
                }
                System.out.println("Вторая матрица");
                for (int k = 0; k < x; k++) {
                    for (int i = 0; i < y; i++) {
                        System.out.print(array2[k][i] + "  ");
                    }
                    System.out.println();
                }


                return (x);
            }

            float sumMatrix() {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                int y = scan.nextInt();
                float[][] array1 = new float[x][y];


                float[][] array2 = new float[x][y];


               float[][] array3 = new float[x][y];
                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array1[k].length; i++) {

                        array3[k][i] = array1[k][i] + array2[k][i];
                    }
                }

                System.out.println("Сумма матриц");
                for (int k = 0; k < x; k++) {
                    for (int i = 0; i < y; i++) {
                        System.out.print(array3[k][i] + "  ");
                    }
                    System.out.println();

                }
                System.out.println();
                System.out.println();
                return(x);

            }



            float multiplyMatrix() {


                    Scanner scan = new Scanner(System.in);
                    System.out.println("Введите строки");


                    int x = scan.nextInt();
                    System.out.println("Введите столбцы");

                    int y = scan.nextInt();
                    float[][] array1 = new float[x][y];

                    System.out.println("Введите строки");
                    int z = scan.nextInt();
                    System.out.println("Введите столбцы");
                    int c = scan.nextInt();
                    float[][] array2 = new float[z][c];
                float[][] array3 = new float[x][c];




                System.out.println("Введите матрицу 1");


                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array1[k].length; i++) {

                        array1[k][i] = scan.nextFloat();
                    }
                }
                System.out.println("Введите матрицу 2");
                for (int k = 0; k < array2.length; k++) {
                    for (int i = 0; i < array2[k].length; i++) {

                        array2[k][i] = scan.nextFloat();
                    }
                }

                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array2[0].length; i++) {
                        for(int j=0; j < array1[0].length; j++) {

                            array3[k][i] += array1[k][j]*array2[j][i];


                        }
                        }

                    }

                System.out.println("Вывод матрицы");
                for (int k = 0; k < array3.length; k++) {
                    for (int i = 0; i < array3[0].length; i++) {
                        System.out.print(array3[k][i] + "  ");
                    }
                    System.out.println();
                }




                return (x);
            }


            float transMatrix() {
                Scanner scan = new Scanner(System.in);
                int x = scan.nextInt();
                int y = scan.nextInt();
                float[][] array1 = new float[x][y];

                System.out.println("Введите матрицу");


                for (int k = 0; k < array1.length; k++) {
                    for (int i = 0; i < array1[k].length; i++) {

                        array1[k][i] = scan.nextFloat();
                    }
                }

                System.out.println("Первая матрица");
                for (int k = 0; k < x; k++) {
                    for (int i = 0; i < y; i++) {
                        System.out.print(array1[k][i] + "  ");
                    }
                    System.out.println();
                }



                float temp[][] = new float[array1[0].length][array1.length];
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1[0].length; j++) {
                        temp[j][i] = array1[i][j];



                    }
                }
                System.out.println("Конечная матрица матрица");
                for (int k = 0; k < temp.length; k++) {
                    for (int i = 0; i < temp[0].length; i++) {
                        System.out.print(temp[k][i] + "  ");
                    }
                    System.out.println();
                }



                return(x);

            }


                public static void main (String[]args){

                    System.out.println("Hello World!");
                    Main obj = new Main();
                    Scanner scan = new Scanner(System.in);
                    int a = scan.nextInt();
                    if (a == 1){
                        obj.inputMatrix();


                    } else if (a == 2) {
                        obj.multiplyMatrix();

                    } else if (a == 3){

                        obj.multiplyMatrix();

                    } else if (a == 4){
                        obj.transMatrix();
                    }


                }
            }
