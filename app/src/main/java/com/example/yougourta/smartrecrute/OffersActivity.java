package com.example.yougourta.smartrecrute;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class OffersActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private List<Offer> offers = new ArrayList();

    private ListView listOffers;
    private OffersAdapter offersAdapter;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent intentCandidatures = new Intent(OffersActivity.this, CandidaturesActivity.class);
                    startActivity(intentCandidatures);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);

        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        Offer offer1 = new Offer("Burger King", "Restauration", "Cormeilles-en-parisis", "Salaire min 7.5€", R.mipmap.ic_burgerking);
        Offer offer2 = new Offer("IKEA", "Vente meubles", "Nanterre", "Salaire min 11.5€", R.mipmap.ic_ikea);
        Offer offer3 = new Offer("Lotus", "Restauration","Clichy", "Salaire min 9€", R.mipmap.ic_burgerking);
        Offer offer4 = new Offer("Pizza Hut", "Pizza","Alfortville", "Salaire min 8.5€", R.mipmap.ic_pizzahut);

        offers.add(offer1);
        offers.add(offer2);
        offers.add(offer3);
        offers.add(offer4);

        offers.add(offer1);
        offers.add(offer2);
        offers.add(offer3);
        offers.add(offer4);

        listOffers = findViewById(R.id.listOffers);
        offersAdapter = new OffersAdapter(this, offers);
        listOffers.setAdapter(offersAdapter);
    }

}
