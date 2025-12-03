
// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.FileReader;
import java.io.IOException;

public class Main {
   public Main() {
   }

   public static void main(String[] var0) {
      String var1 = var0[0];
      String var2 = var0[1];

      try {
         FileReader var3 = new FileReader(var2);
         String var5 = "";

         int var4;
         while((var4 = var3.read()) != -1) {
            char var6 = (char)var4;
            var5 = var5 + var6;
            if (var4 == 10) {
               if (var5.contains(var1)) {
                  System.out.println(var5);
               }

               var5 = "";
            }
         }

         var3.close();
      } catch (IOException var7) {
         var7.printStackTrace();
      }

   }
}