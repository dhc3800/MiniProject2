package com.dhc3800.mp2again;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

import java.util.ArrayList;

public class searchCategory extends AppCompatActivity implements View.OnClickListener {

    public CheckBox normal, fire, fighting, water, psychic, ground, rock, fairy, dragon, poison,
            electric, grass, bug, flying, ice, dark, ghost, steel;

    public TextView aF, dF, hpF;

    ArrayList<String> types = new ArrayList<>();

    public Button cancel, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_category);
        cancel = findViewById(R.id.cancel);
        next = findViewById(R.id.next);

        aF = findViewById(R.id.attackField);
        dF = findViewById(R.id.defenseField);
        hpF = findViewById(R.id.hpField);

        normal = findViewById(R.id.normal);
        fire =  findViewById(R.id.fire);
        fighting = findViewById(R.id.fighting);
        water = findViewById(R.id.water);
        psychic =  findViewById(R.id.psychic);
        ground =  findViewById(R.id.ground);
        rock =  findViewById(R.id.rock);
        fairy =  findViewById(R.id.fairy);
        dragon =  findViewById(R.id.dragon);
        poison =  findViewById(R.id.poison);
        electric =  findViewById(R.id.electric);
        grass =  findViewById(R.id.grass);
        bug =  findViewById(R.id.bug);
        flying =  findViewById(R.id.flying);
        ice =  findViewById(R.id.ice);
        dark =  findViewById(R.id.dark);
        ghost =  findViewById(R.id.ghost);
        steel =  findViewById(R.id.steel);

        normal.setOnClickListener(this);
        fire.setOnClickListener(this);
        fighting.setOnClickListener(this);
        water.setOnClickListener(this);
        psychic.setOnClickListener(this);
        ground.setOnClickListener(this);
        rock.setOnClickListener(this);
        fairy.setOnClickListener(this);
        dragon.setOnClickListener(this);
        poison.setOnClickListener(this);
        electric.setOnClickListener(this);
        grass.setOnClickListener(this);
        bug.setOnClickListener(this);
        flying.setOnClickListener(this);
        ice.setOnClickListener(this);
        dark.setOnClickListener(this);
        ghost.setOnClickListener(this);
        steel.setOnClickListener(this);

        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                // Start NewActivity.class
                Intent myIntent = new Intent(searchCategory.this,
                        MainActivity.class);
                startActivity(myIntent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent myIntent = new Intent(searchCategory.this,
                        DisplayList.class); // change this to grid view


                // these are sent to next screen
                // String[] atypes = (String[]) types.toArray();
                int attack = Integer.parseInt(aF.getText().toString());
                int defense = Integer.parseInt(dF.getText().toString());
                int hp = Integer.parseInt(hpF.getText().toString());
                myIntent.putExtra("random", false);

                myIntent.putExtra("types", types);
                myIntent.putExtra("attack", attack);
                myIntent.putExtra("defense", defense);
                myIntent.putExtra("hp", hp);
                // add intent for filtered pokemon

                startActivity(myIntent);

            }
        });

        // set attack, defense, hp to something


    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.normal:
                //normal.setChecked(!normal.isChecked());
                if (!normal.isChecked()) {
                    types.add("Normal");
                } else {
                    types.remove("Normal");
                }
                break;
            case R.id.fire:
                // fire.setChecked(!fire.isChecked());
                if (!normal.isChecked()) {
                    types.add("Fire");
                } else {
                    types.remove("Fire");
                }
                break;
            case R.id.fighting:
                //fighting.setChecked(!fighting.isChecked());
                if (!normal.isChecked()) {
                    types.add("Fighting");
                } else {
                    types.remove("Fighting");
                }
                break;
            case R.id.flying:
//                flying.setChecked(!flying.isChecked());
                if (!normal.isChecked()) {
                    types.add("Flying");
                } else {
                    types.remove("Flying");
                }
                break;
            case R.id.ground:
//                ground.setChecked(!ground.isChecked());
                if (!normal.isChecked()) {
                    types.add("Ground");
                } else {
                    types.remove("Ground");
                }
                break;
            case R.id.psychic:
//                psychic.setChecked(!psychic.isChecked());
                if (!normal.isChecked()) {
                    types.add("Psychic");
                } else {
                    types.remove("Psychic");
                }
                break;
            case R.id.poison:
//                poison.setChecked(!poison.isChecked());
                if (!normal.isChecked()) {
                    types.add("Poison");
                } else {
                    types.remove("Poison");
                }
                break;
            case R.id.dark:
//                dark.setChecked(!dark.isChecked());
                if (!normal.isChecked()) {
                    types.add("Dark");
                } else {
                    types.remove("Dark");
                }
                break;
            case R.id.rock:
//                rock.setChecked(!rock.isChecked());
                if (!normal.isChecked()) {
                    types.add("Rock");
                } else {
                    types.remove("Rock");
                }
                break;
            case R.id.water:
//                water.setChecked(!water.isChecked());
                if (!normal.isChecked()) {
                    types.add("Water");
                } else {
                    types.remove("Water");
                }
                break;
            case R.id.ghost:
//                ghost.setChecked(!ghost.isChecked());
                if (!normal.isChecked()) {
                    types.add("Ghost");
                } else {
                    types.remove("Ghost");
                }
                break;
            case R.id.grass:
//                grass.setChecked(!grass.isChecked());
                if (!normal.isChecked()) {
                    types.add("Grass");
                } else {
                    types.remove("Grass");
                }
                break;
            case R.id.bug:
//                bug.setChecked(!bug.isChecked());
                if (!normal.isChecked()) {
                    types.add("Bug");
                } else {
                    types.remove("Bug");
                }
                break;
            case R.id.electric:
//                electric.setChecked(!electric.isChecked());
                if (!normal.isChecked()) {
                    types.add("Electric");
                } else {
                    types.remove("Electric");
                }
                break;
            case R.id.fairy:
//                fairy.setChecked(!fairy.isChecked());
                if (!normal.isChecked()) {
                    types.add("Fairy");
                } else {
                    types.remove("Fairy");
                }
                break;
            case R.id.dragon:
//                dragon.setChecked(!dragon.isChecked());
                if (!normal.isChecked()) {
                    types.add("Dragon");
                } else {
                    types.remove("Dragon");
                }
                break;
            case R.id.ice:
//                ice.setChecked(!ice.isChecked());
                if (!normal.isChecked()) {
                    types.add("Ice");
                } else {
                    types.remove("Ice");
                }
                break;
            case R.id.steel:
//                steel.setChecked(!steel.isChecked());
                if (!normal.isChecked()) {
                    types.add("Steel");
                } else {
                    types.remove("Steel");
                }
                break;

        }
    }

}
