package com.example.pankaj.app28;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtDesktop = findViewById(R.id.txtDesktopComputer);
        TextView txtDesktopPerformance = findViewById(R.id.txtDesktopComputerPerformance);

        TextView txtLaptop = findViewById(R.id.txtLaptopComputer);
        TextView txtLaptopPerformance = findViewById(R.id.txtLaptopComputerPerformance);

        TextView txtSmartPhone = findViewById(R.id.txtSmartphoneComputer);
        TextView txtSmartPhonePerformance = findViewById(R.id.txtSmartphoneComputerPerformance);

        TextView txtTablet = findViewById(R.id.txtTabletComputer);
        TextView txtTabletPerformance = findViewById(R.id.txtTabletComputerPerformance);

        DesktopComputer desktopComputer = new DesktopComputer("iMac","Physical Keyboard","Retina display","Physical mouse",800,1024);

        LaptopComputer laptopComputer = new LaptopComputer("Mac Book","Physical Keyboard","Retina display","Physical Mouse","High Quality",900,2048);

        SmartphoneComputer smartphoneComputer = new SmartphoneComputer("J7 2016","Virtual Keyboard","good quality","Android 7.0",1000,2048);

        TabletComputer tabletComputer = new TabletComputer("iBall","Virtual keyboard","good quality","Android 4.3",512,1024,6);

        txtDesktopPerformance.setText("Performance: " + desktopComputer.evaluatePerformance() + "\n");

        txtLaptopPerformance.setText("Performance: "+ laptopComputer.evaluatePerformance() + "\n");

        txtSmartPhonePerformance.setText("Performance: " + smartphoneComputer.evaluatePerformance() + "\n");

        txtTabletPerformance.setText("Performance: " + tabletComputer.evaluatePerformance() + "\n");

        Computer [] computers = new Computer[4];
        computers[0] = desktopComputer;
        computers[1] = laptopComputer ;
        computers[2] = smartphoneComputer;
        computers[3] = tabletComputer;

        for (Computer computer : computers){

            if (computer instanceof DesktopComputer){
                DesktopComputer currentDesktopComputer = (DesktopComputer) computer;
                txtDesktop.setText(currentDesktopComputer.toString());
            }
            if (computer instanceof  LaptopComputer){
                LaptopComputer currentLaptopComputer = (LaptopComputer) computer;
                txtLaptop.setText(currentLaptopComputer.toString());
            }
            if (computer instanceof SmartphoneComputer) {
                if (!(computer instanceof TabletComputer)) {
                    SmartphoneComputer currentSmartPhone = (SmartphoneComputer) computer;
                    txtSmartPhone.setText(currentSmartPhone.toString());
                }
            }
            if (computer instanceof TabletComputer){
                TabletComputer currentTablet = (TabletComputer) computer;
                txtTablet.setText(currentTablet.toString());
            }
        }

    }
}
