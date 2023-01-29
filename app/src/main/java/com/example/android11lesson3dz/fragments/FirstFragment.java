package com.example.android11lesson3dz.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.android11lesson3dz.R;


public class FirstFragment extends Fragment {
    private EditText etPsw;
    private Button btnInput;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etPsw = view.findViewById(R.id.et_psw);
        btnInput = view.findViewById(R.id.btn_input);
        click();
    }

    private void click() {
        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = etPsw.getText().toString().trim();
                if (!password.equals("admin")) {
                    etPsw.setError("Не правельный пароль");
                } else {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, new NamesFragment())
                            .addToBackStack(FirstFragment.class.getName())
                            .commit();
                }
            }
        });
    }

//    holder.itemView.setOnLongClickListener {
//        val builder = AlertDialog.Builder(this)
//        builder.setTitle("Delete")
//        builder.setMessage("Are you Sure To Delete?")
//
//        builder.setPositiveButton(android.R.string.yes) { dialog, which ->
//                Toast.makeText(applicationContext,
//                        android.R.string.yes, Toast.LENGTH_SHORT).show()
//        }
//
//        builder.setNegativeButton(android.R.string.no) { dialog, which ->
//                Toast.makeText(applicationContext,
//                        android.R.string.no, Toast.LENGTH_SHORT).show()
//        }
//
//        builder.setNeutralButton("Maybe") { dialog, which ->
//                Toast.makeText(applicationContext,
//                        "Maybe", Toast.LENGTH_SHORT).show()
//        }
//        builder.show()
//        false
//    }



//        itemView.setOnLongClickListener(new View.OnLongClickListener() {
//
//        @Override
//
//        public boolean onLongClick(View view) {
//
//            moviesList.remove(getAdapterPosition());
//
//            notifyItemRemoved(getAdapterPosition());
//
//            return true;
//
//        }
//
//    });
//    public String addChar(String str, char ch, int position) {
//        int len = str.length();
//        char[] updatedArr = new char[len + 1];
//        str.getChars(0, position, updatedArr, 0);
//        updatedArr[position] = ch;
//        str.getChars(position, len, updatedArr, position + 1);
//        return new String(updatedArr);
//    }
//public String addChar(String str, char ch, int position) {
//    return str.substring(0, position) + ch + str.substring(position);
//}

}