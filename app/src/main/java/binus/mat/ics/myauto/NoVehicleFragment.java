package binus.mat.ics.myauto;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;


public class NoVehicleFragment extends Fragment {

    private TextView mEmptyGarage;
    private Button mAddVehicle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.fragment_no_vehicle, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mEmptyGarage = getView().findViewById(R.id.noVehicleText);
        mAddVehicle = getView().findViewById(R.id.addVehicleButton);

        mEmptyGarage.setText(getString(R.string.empty_garage));

        mAddVehicle.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), ManageVehicleActivity.class);
            intent.putExtra("launchAddVehicleDialog", true);
            startActivity(intent);
        });
    }
}