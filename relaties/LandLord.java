package com.relaties;

public class LandLord {
   private String name;
   private Pet pet;

   public LandLord(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public Pet getPet() {
      return pet;
   }

   public void setPet(Pet pet) {
      this.pet = pet;
   }
}
