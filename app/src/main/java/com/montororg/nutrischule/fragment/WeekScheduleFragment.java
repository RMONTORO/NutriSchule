package com.montororg.nutrischule.fragment;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.montororg.nutrischule.R;
import com.montororg.nutrischule.adapter.WeekCard;
import com.montororg.nutrischule.adapter.WeekCardListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeekScheduleFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeekScheduleFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WeekScheduleFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeekScheduleFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeekScheduleFragment newInstance(String param1, String param2) {
        WeekScheduleFragment fragment = new WeekScheduleFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view;
        view = inflater.inflate(R.layout.fragment_week_schedule, container, false);


        //Card list (dishes)
        List<WeekCard> dishesList = new ArrayList<>();
        dishesList.add(new WeekCard(WeekCard.COLOR_0, getString(R.string.monday_title)));
        dishesList.add(new WeekCard(WeekCard.COLOR_1, getString(R.string.monday_1)));
        dishesList.add(new WeekCard(WeekCard.COLOR_2, getString(R.string.monday_2)));
        dishesList.add(new WeekCard(WeekCard.COLOR_1, getString(R.string.monday_3)));
        dishesList.add(new WeekCard(WeekCard.COLOR_2, getString(R.string.monday_4)));
        dishesList.add(new WeekCard(WeekCard.COLOR_1, getString(R.string.monday_5)));
        dishesList.add(new WeekCard(WeekCard.COLOR_2, getString(R.string.monday_6)));

        WeekCardListAdapter weekCardListAdapter = new WeekCardListAdapter(dishesList, this.getContext());
        RecyclerView dishesRecyclerview = view.findViewById(R.id.dishes_recyclerview);
        GridLayoutManager dishesGridLayoutManager = new GridLayoutManager(this.getContext(), 7, GridLayoutManager.HORIZONTAL, false);

        dishesRecyclerview.setHasFixedSize(true);
        dishesRecyclerview.setLayoutManager(dishesGridLayoutManager);
        dishesRecyclerview.setAdapter(weekCardListAdapter);



        return view;
    }
}