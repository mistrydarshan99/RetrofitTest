package com.example.darshanmistry.retrofit.model.responseModel;

import java.util.List;

public class DatabaseBean
{
    private String Count;

    private String Message;

    private List<DatabaseInnerListBean> ObjectList;

    public String getCount ()
    {
        return Count;
    }

    public void setCount (String Count)
    {
        this.Count = Count;
    }

    public String getMessage ()
    {
        return Message;
    }

    public void setMessage (String Message)
    {
        this.Message = Message;
    }

    public List<DatabaseInnerListBean> getObjectList() {
        return ObjectList;
    }

    public void setObjectList(List<DatabaseInnerListBean> objectList) {
        ObjectList = objectList;
    }


}
