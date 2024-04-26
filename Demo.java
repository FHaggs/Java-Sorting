import static com.raylib.Jaylib.RAYWHITE;
import static com.raylib.Jaylib.VIOLET;
import static com.raylib.Jaylib.DARKGRAY;
import static com.raylib.Raylib.*;

import java.util.Random;

public class Demo {
    public static void main(String args[]) {
        int boxWidth = 32; 
        int arr_length = 50;
        int[] arr = new int[arr_length];
        
        initArray(arr);

        suffle(arr); 

        InitWindow(2000, 1000, "Sorting");
        SetTargetFPS(60);

        while (!WindowShouldClose()) {
            BeginDrawing();

            DrawText("Comands: B = bubbleSort S = Suffle", 1605, 10, 20, DARKGRAY);


            if (IsKeyDown(KEY_B)) {

                bubbleSort(arr);
                drawArray(arr, boxWidth);
            
            } else {
                    drawArray(arr, boxWidth);
            }
    
            if(IsKeyDown(KEY_S)){
                suffle(arr);
            }


            ClearBackground(RAYWHITE);
            EndDrawing();
        }
        CloseWindow();
    }
    public static int bubbleSort(int[] copy){

        for(int i=0;i<copy.length-1;i++){
            for(int j=0;j < copy.length-1 -i;j++){
                if(copy[j]>copy[j+1]){
                    int temp = copy[j];
                    copy[j] = copy[j+1];
                    copy[j+1] = temp;
                    return 1;
                }
            }
        }
        return 0;



    }
    public static void initArray(int[] arr){

        for(int i=0;i<arr.length;i++){
            int r = 20*i;
            arr[i] = r;
        }
    }
    public static void suffle(int[] arr){

        int rand_index;
        Random rand = new Random();


        for(int i=0;i<arr.length;i++){
            rand_index = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[rand_index];
            arr[rand_index] = temp;
        }
    }
    // lalalal
    public static void drawArray(int[] arr,int boxWidth){
       int posX = 0;

        for(int i = 0; i < arr.length; i++){
            posX = boxWidth*i;
            DrawRectangle(posX, GetScreenHeight()-arr[i], boxWidth, arr[i], VIOLET);
        }
    }
}
