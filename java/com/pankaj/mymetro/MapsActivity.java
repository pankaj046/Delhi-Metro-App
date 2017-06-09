package com.pankaj.mymetro;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(new LatLng(28.45927, 77.07268)).title("HUDA CITY CENTRE").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.47209, 77.07175)).title("IFFCO CHOWK").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.47957, 77.08006)).title("M G ROAD").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.48182, 77.09235)).title("SIKANDARPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.48203, 77.10232)).title("GURU DRONACHARYA").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.48076, 77.12583)).title("ARJANGARH").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.49383, 77.14922)).title("GHITORNI").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.49927, 77.16153)).title("SULTANPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.50671, 77.17484)).title("CHHATTARPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.51302, 77.18648)).title("QUTAB MINAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.52060, 77.20138)).title("SAKET").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.52798, 77.20565)).title("MALVIYA NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.54335, 77.20667)).title("HAUZ KHAS").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67319, 77.16994)).title("GREEN PARK").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.56892, 77.20771)).title("AIIMS").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.57526, 77.20935)).title("INA").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.58708, 77.21209)).title("JORBAGH").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59726, 77.21088)).title("LOK KALYAN MARG").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.61166, 77.21198)).title("UDYOG BHAWAN").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.61474, 77.21191)).title("CENTRAL SECRETARIAT (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62295, 77.21389)).title("PATEL CHOWK").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63282, 77.21826)).title("RAJIV CHOWK (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64307, 77.22144)).title("NEW DELHI (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64931, 77.22637)).title("CHAWRI BAZAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.65785, 77.23014)).title("CHANDNI CHOWK").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66750, 77.22817)).title("KASHMERE GATE (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67726, 77.22410)).title("CIVIL LINES").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.69480, 77.21483)).title("VIDHAN SABHA").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.69480, 77.21483)).title("VISHWAVIDYALAYA").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.69785, 77.20722)).title("G.T.B. NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.70278, 77.19363)).title("MODEL TOWN").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.70696, 77.18053)).title("AZADPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.71642, 77.17046)).title("ADARSH NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.72592, 77.16267)).title("JAHANGIRPURI").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        // mMap.addMarker(new MarkerOptions().position(HAIDERPUR).title("HAIDERPUR BADLI MOR").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        // mMap.addMarker(new MarkerOptions().position(ROHINISECTOR18).title("ROHINI SECTOR 18,19").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));
        // mMap.addMarker(new MarkerOptions().position(SAMAYPUR).title("SAMAYPUR BADLI").icon(BitmapDescriptorFactory.fromResource(R.drawable.yellow)));

        //-------------------------End Of Yellow Line--------------------------------------------------------------------
        //-------------------------Start Red Line------------------------------------------------------------------------
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.72072, 77.10713)).title("RITHALA").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.71483, 77.11467)).title("ROHINI WEST").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.70760, 77.12591)).title("ROHINI EAST").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.70317, 77.13223)).title("PITAM PURA").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.69810, 77.14024)).title("KOHAT ENCLAVE").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.69591, 77.15226)).title("NETAJI SUBHASH PLACE").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68894, 77.16160)).title("KESHAV PURAM").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68254, 77.16459)).title("KANHAIYA NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67319, 77.16994)).title("INDER LOK (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66999, 77.18169)).title("SHASTRI NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66662, 77.19882)).title("PRATAP NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66636, 77.20727)).title("PUL BANGASH").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66711, 77.21653)).title("TIS HAZARI").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66800, 77.24994)).title("SHASTRI PARK").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66989, 77.26678)).title("SEELAMPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67180, 77.27756)).title("WELCOME").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67345, 77.28962)).title("SHAHDARA").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67544, 77.30095)).title("MANSAROVAR PARK").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67579, 77.31239)).title("JHIL MIL").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67592, 77.32142)).title("DILSHAD GARDEN").icon(BitmapDescriptorFactory.fromResource(R.drawable.red)));
        //-------------------------------------------Red Line Ends-------------------------------------------------------------------------------------------------
        //-------------------------------------------Green Line Start----------------------------------------------------------------------------------------------
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("MUNDKA").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68221, 77.04381)).title("RAJDHANI PARK").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68208, 77.05596)).title("NANGLOI RLY. STATION").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68231, 77.06471)).title("NANGLOI").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68180, 77.07385)).title("SURAJMAL STADIUM").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.68090, 77.08077)).title("UDYOG NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67959, 77.09261)).title("PEERA GARHI").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67855, 77.10227)).title("PASCHIM VIHAR (WEST)").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67730, 77.11228)).title("PASCHIM VIHAR (EAST)").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67734, 77.11965)).title("MADI PUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67490, 77.13056)).title("SHIVAJI PARK").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.67153, 77.15527)).title("ASHOK PARK MAIN (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.66199, 77.15748)).title("SATGURU RAM SINGH MARG").icon(BitmapDescriptorFactory.fromResource(R.drawable.green)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.65575, 77.15057)).title("KIRTI NAGAR (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        //--------------------------------------------------End Red Line-----------------------------------------------------------------------------------------------------
        //-------------------------------------------------Start Blue Line---------------------------------------------------------------------------------------------------
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("ESCORTS MUJESAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("BATA CHOWK").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("NEELAM CHOWK AJRONDA").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("OLD FARIDABAD").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("BADKAL MOR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("SECTOR-28").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("MEWALA MAHARAJPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("NHPC CHOWK").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("SARAI").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.49334, 77.30307)).title("BADARPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.50254, 77.29930)).title("TUGHLAKABAD").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.51938, 77.29388)).title("MOHAN ESTATE").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.52878, 77.28826)).title("SARITA VIHAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.53824, 77.28319)).title("JASOLA APOLLO").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.54292, 77.27504)).title("OKHLA").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.54451, 77.26401)).title("GOVIND PURI").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.55007, 77.25835)).title("KALKAJI MANDIR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.55148, 77.25154)).title("NEHRU PLACE").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.55527, 77.24205)).title("KAILASH COLONY").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.56417, 77.23423)).title("MOOLCHAND").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.57079, 77.23653)).title("LAJPAT NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.53824, 77.28319)).title("JANGPURA").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59040, 77.23326)).title("JLN STADIUM").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.60276, 77.22829)).title("KHAN MARKET").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("JANPATH").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62588, 77.23410)).title("MANDI HOUSE (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        // mMap.addMarker(new MarkerOptions().position(new LatLng(28.68321, 77.03133)).title("ITO").icon(BitmapDescriptorFactory.fromResource(R.drawable.blue)));
        //-------------------------------End Green Line-------------------------------------------------------------------------------------------------------
        //-------------------------------------------------Start Orange Line---------------------------------------------------------------------------------
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.55693, 77.08669)).title("IGI AIRPORT").icon(BitmapDescriptorFactory.fromResource(R.drawable.orange)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.54881, 77.12092)).title("DELHI AERO CITY").icon(BitmapDescriptorFactory.fromResource(R.drawable.orange)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59178, 77.16155)).title("DHAULA KUAN").icon(BitmapDescriptorFactory.fromResource(R.drawable.orange)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62901, 77.21190)).title("SHIVAJI STADIUM").icon(BitmapDescriptorFactory.fromResource(R.drawable.orange)));
        //-------------------------------------------------End Orange Line---------------------------------------------------------------------------------
        // --------------------------------------------------Voilet Line Start-------------------------------------------------------------------------------
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.55226, 77.05828)).title("DWARKA SEC 21 (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.56583, 77.06706)).title("DWARKA SEC 8").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.57487, 77.06454)).title("DWARKA SEC 9").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.58068, 77.05682)).title("DWARKA SEC 10").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.58657, 77.04929)).title("DWARKA SEC 11").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59232, 77.04051)).title("DWARKA SEC 12").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59722, 77.03326)).title("DWARKA SEC 13").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.60223, 77.02588)).title("DWARKA SEC 14").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.61564, 77.02197)).title("DWARKA").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.61932, 77.03326)).title("DWARKA MOR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62025, 77.04514)).title("NAWADA").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62177, 77.05585)).title("UTTAM NAGAR WEST").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62481, 77.06530)).title("UTTAM NAGAR EAST").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62943, 77.07767)).title("JANAK PURI WEST").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63305, 77.08669)).title("JANAK PURI EAST").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63657, 77.09648)).title("TILAK NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64039, 77.10495)).title("SUBHASH NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64379, 77.11284)).title("TAGORE GARDEN").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64902, 77.12270)).title("RAJOURI GARDEN").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.65274, 77.13164)).title("RAMESH NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.65784, 77.14248)).title("MOTI NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.65160, 77.15824)).title("SHADIPUR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64498, 77.16929)).title("PATEL NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64250, 77.17815)).title("RAJENDRA PLACE").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64400, 77.18855)).title("KAROL BAGH").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64427, 77.19988)).title("JHANDEWALAN").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63923, 77.20840)).title("RK ASHRAM MARG").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63003, 77.22436)).title("BARAKHAMBA").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62342, 77.24250)).title("PRAGATI MAIDAN").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62051, 77.24993)).title("INDRAPRASTHA").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62331, 77.26792)).title("YAMUNA BANK (Junction)").icon(BitmapDescriptorFactory.fromResource(R.drawable.jun)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.61806, 77.27869)).title("AKSHARDHAM").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.60442, 77.28925)).title("MAYUR VIHAR-I").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.59428, 77.29455)).title("MAYUR VIHAR-I EXT").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.58916, 77.30204)).title("NEW ASHOK NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.58512, 77.31139)).title("NOIDA SEC 15").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.57819, 77.31757)).title("NOIDA SEC 16").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.57081, 77.32612)).title("NOIDA SEC 18").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.56409, 77.33420)).title("BOTANICAL GARDEN").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.56714, 77.34598)).title("GOLF COURSE").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.62901, 77.35608)).title("NOIDA CITY CENTRE").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64997, 77.33974)).title("VAISHALI").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64544, 77.32432)).title("KAUSHAMBI").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64695, 77.31603)).title("ANAND VIHAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64849, 77.30558)).title("KARKAR DUMA").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.64171, 77.29543)).title("PREET VIHAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63663, 77.28683)).title("NIRMAN VIHAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.addMarker(new MarkerOptions().position(new LatLng(28.63064, 77.27749)).title("LAXMI NAGAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.voilet)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(28.51302, 77.18648), 12));
        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }
}
