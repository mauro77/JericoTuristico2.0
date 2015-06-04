package com.mauriciohincapie.jericoturistico20;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Portada extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portada);





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portada, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragnentTransaction = fragmentManager.beginTransaction();
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hoteles) {
            Hoteles fragment=new Hoteles();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;

        }
        if (id == R.id.restaurantes) {
            Restaurantes fragment=new Restaurantes();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;
        }
        if (id == R.id.bares) {
            Bares fragment=new Bares();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;
        }
        if (id == R.id.turisticos) {
            Turisticos fragment=new Turisticos();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;
        }
        if (id == R.id.demografia) {
            Demografia fragment=new Demografia();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;
        }
        if (id == R.id.about) {
            About fragment=new About();
            fragnentTransaction.replace(android.R.id.content, fragment);
            fragnentTransaction.addToBackStack(null);
            fragnentTransaction.commit();
            return true;
        }

        if (id == R.id.mapa) {
            Intent i=new Intent(this,Mapa.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            this.finish();
        } else {
            getFragmentManager().popBackStack();
        }
    }
}

