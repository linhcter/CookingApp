package com.food_on.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAtSMLooI:APA91bFNlDXvVvGRpwanF4jb7UoI7PUxxVcMzFcpdQXuFst5noA__6Yb_FJYG12in8TwpUu7ZY9p6TafwXwE-kXjYf93EbGCh9xahZwIyyNi2gGvoR6FRVhsOoyYeJ1yrRzKHQ6zwFdy"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
