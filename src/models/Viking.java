package models;

public class Viking extends Human{
   private int bebedorProfesional;

   public Viking(int bebedorProfesional) {
      this.bebedorProfesional = bebedorProfesional;
   }

   public int getBebedorProfesional() {
      return bebedorProfesional;
   }

   public void setBebedorProfesional(int bebedorProfesional) {
      this.bebedorProfesional = bebedorProfesional;
   }
}
