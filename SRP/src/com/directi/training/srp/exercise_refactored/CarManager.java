package com.directi.training.srp.exercice_refactored;

public class CarManager {

    private Dao _dao;
    private CarFormatter _formatter;
    private CarRater _rater;

    public CarManager(Dao dao, CarFormatter formatter, CarRater rater) {
        this._dao = dao;
        this._formatter = formatter;
        this._rater = rater;
    }
}
