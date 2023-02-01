package com.adolfo.miguel.Proyectoparking.pool;

public class pool {
    

        private int[] sorteo;
        public int pool;

        public pool(int sorteo){

            this.sorteo = getSorteo(10); 

        }

        public int[] sorteo(int[] sorteo){

            for(int i = 0; i < 10; i++){

                sorteo[i] = (int)(Math.random() * 11);

            }
            return this.sorteo;
        }

        public int[] getSorteo(int i){
            return this.sorteo;
        }

        public void setSorteo(int[] sorteo){
            this.sorteo = sorteo;
        }

        public int[] getSorteo(int[] sorteo) {
            return this.sorteo = sorteo;
        }

        public int[] setSorteo(int i) {
            return null;
        }
    

}
