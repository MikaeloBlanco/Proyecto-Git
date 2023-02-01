package com.adolfo.miguel.Proyectoparking.pool;

public class pool {
    
    public pool(){

        this((int)(Math.random() * 11));

    }
        private int sorteo;
        public int pool;

        public pool(int sorteo){

            this.sorteo = sorteo; 

        }

        public int sorteo(int sorteo){
            
            return this.sorteo;
        }

        public void getSorteo(int sorteo){
            this.sorteo = sorteo;
        }

        public int setSorteo(int sorteo) {
            
            return this.sorteo = sorteo;

        }
    

}
