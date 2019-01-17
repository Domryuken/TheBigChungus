package com.chungus.big.the.thebigchungus.workout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chungus.big.the.thebigchungus.R;
import com.chungus.big.the.thebigchungus.workout.models.WorkoutModel;

public class WorkoutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View retView = inflater.inflate(R.layout.workout_fragment, container, false);
        WorkoutModel workoutModel = new WorkoutModel("A Workout", 10, 10, 10);

        TextView tv = (TextView)container.findViewById(R.id.workout_name);
        tv.setText(workoutModel.getName());

        return retView;
    }
}
