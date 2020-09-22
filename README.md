# MultipleManifest
## DIFFERENT BACKGROUND, DIFFERENT APK, DIFFERENT MANIFEST, ONLY ONE APP

In this project, i create 2 different manifest, in addiction to the main, under the folder green and red(the main is inside the folder main).
Then in gradle I added this code: 

`flavorDimensions "version"

    productFlavors {
    
        green {
        
            dimension "version"
            
        }
        
        red {
        
            dimension "version"
            
        }
        
    }`
   
   And now i have 2 different build variant (red and green).
   In the main manifest remove the attribute 
   
    `android:theme="@style/AppTheme"/>`
    
   And added attribute theme in the other 2 manifest (red and green):
    
   `android:theme="@style/AppTheme.Red"`
   
   `android:theme="@style/AppTheme.Green"`
   
   Now when launch the build green, the background is green and with the build red, the background is red.
   
   That's all.
