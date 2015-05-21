package com.mauriciohincapie.jericoturistico20;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.res.Configuration;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Principal extends ListFragment {

    private String[] opciones = {"Hotels","Restaurants","Bares",
            "Tourist Places","Information","About"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_principal, container, false);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragnentTransaction = fragmentManager.beginTransaction();
        super.onListItemClick(l, v, position, id);
        int orientation = getResources().getConfiguration().orientation;

        if(orientation == Configuration.ORIENTATION_LANDSCAPE ) {
            switch (position) {
                case 0:
                    Hoteles fragment = new Hoteles();
                    fragnentTransaction.replace(R.id.detalle, fragment,null);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 1:
                    Restaurantes fragment1 = new Restaurantes();
                    fragnentTransaction.replace(R.id.detalle, fragment1);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 2:
                    Bares fragment2 = new Bares();
                    fragnentTransaction.replace(R.id.detalle, fragment2);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;

                case 3:
                    Turisticos fragment3 = new Turisticos();
                    fragnentTransaction.replace(R.id.detalle, fragment3);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 4:
                    Demografia fragment4 = new Demografia();
                    fragnentTransaction.replace(R.id.detalle, fragment4);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 5:
                    About fragment5 = new About();
                    fragnentTransaction.replace(R.id.detalle, fragment5);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;

            }
        }
        else{
            switch (position) {
                case 0:
                    Hoteles fragment = new Hoteles();
                    fragnentTransaction.replace(android.R.id.content, fragment,null);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 1:
                    Restaurantes fragment1 = new Restaurantes();
                    fragnentTransaction.replace(android.R.id.content, fragment1);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 2:
                    Bares fragment2 = new Bares();
                    fragnentTransaction.replace(android.R.id.content, fragment2);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;

                case 3:
                    Turisticos fragment3 = new Turisticos();
                    fragnentTransaction.replace(android.R.id.content, fragment3);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 4:
                    Demografia fragment4 = new Demografia();
                    fragnentTransaction.replace(android.R.id.content, fragment4);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;
                case 5:
                    About fragment5 = new About();
                    fragnentTransaction.replace(android.R.id.content, fragment5);
                    fragnentTransaction.addToBackStack(null);
                    fragnentTransaction.commit();
                    break;

            }

        }

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, opciones));
    }

}