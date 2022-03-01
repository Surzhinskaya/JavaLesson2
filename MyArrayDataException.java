package Homework2;

    public class MyArrayDataException extends Exception{
int i;
int k;

        MyArrayDataException (int i, int k)  {
            super(String.format("Неверные данные находятся в ячейке "+ i + k ));
            this.i = i;
            this.k=k;
        }

           }

