package com.adolfo.miguel.Proyectoparking.pool;

public class pool {
    

        private int[] sorteo = new int[10];
        public int pool;

        public pool(int sorteo){

            this.sorteo = sorteo(null); 

        }

        public int[] sorteo(int[] sorteo){

            for(int i = 0; i < 10; i++){

                sorteo[i] = (int)(Math.random() * 11);

            }
            return this.sorteo;
        }

        public int[] getSorteo(){
            return this.sorteo;
        }

        public void setSorteo(int[] sorteo){
            this.sorteo = sorteo;
        }

        public int setSorteo(int i) {
            return 0;
        }
    

}
