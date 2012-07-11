package com.arid.sudoku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
    }
    
    public void inputSudoku(View view){    	
    	
    	// Handling input sudoku case
        Intent input_intent = new Intent(this, InputActivity.class);
        startActivity(input_intent);
    }
}
