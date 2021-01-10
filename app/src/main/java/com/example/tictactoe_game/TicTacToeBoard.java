//package com.example.tictactoe_game;
//
//import android.content.Context;
//import android.content.res.TypedArray;
//import android.util.AttributeSet;
//import android.view.View;
//
//import androidx.annotation.Nullable;
//
//public class TicTacToeBoard<paint> extends View {
//
//    private final int boardColor;
//    private final int XColor;
//    private final int OColor;
//    private final int winningLineColor;
//
//    private final int Paint paint = new Paint();
//
//    public TicTacToeBoard(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//
//        TypedArray a = context.getTheme().obtainStyledAttributes(attrs,
//                R.styleable.TicTacToeBoard, 0, 0);
//
//        try {
//            boardColor = a.getInteger(R.styleable.TicTacToeBoard_boardColor, 0);
//            XColor = a.getInteger(R.styleable.TicTacToeBoard_XColor, 0);
//            OColor = a.getInteger(R.styleable.TicTacToeBoard_OColor, 0);
//            winningLineColor = a.getInteger(R.styleable.TicTacToeBoard_winningLineColor, 0);
//        }finally {
//            a.recycle();
//        }
//
//        @Override
//        protected void onMeasure(int width, int height){
//            super.measure(width, height);
//
//            int dimensions = Math.min(getMeasuredWidth(), getMeasuredHeight());
//
//            setMeasuredDimension(dimensions, dimensions);
//        }
//    }
//}
