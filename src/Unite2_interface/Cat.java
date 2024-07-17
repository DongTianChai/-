package Unite2_interface;
 class Cat extends Animal{

     public void shoot(){
         System.out.print("喵喵喵~~~");

     }
     public void eat(Food food){
         System.out.println(super.getName()+"正在吃香喷喷的"+food.getName());
     }
     public Cat(String name){
         super(name);
     }
}
