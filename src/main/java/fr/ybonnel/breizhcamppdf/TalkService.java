/*
 * Copyright 2013- Yan Bonnel
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.ybonnel.breizhcamppdf;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import fr.ybonnel.breizhcamppdf.model.TalkDetail;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public enum TalkService {
    INSTANCE;

    private Map<String, TalkDetail> talks = new HashMap<>();

    private Gson gson = new GsonBuilder().create();

    public TalkDetail getTalkDetail(String id) {
        if (!talks.containsKey(id)) {
            try {
                System.out.println("Getting talk detail " + id);
                URL url = new URL("http://cfp.breizhcamp.org/accepted/talk/" + id);
                URLConnection connection = url.openConnection();
                talks.put(id, gson.fromJson(new InputStreamReader(connection.getInputStream()), TalkDetail.class));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return talks.get(id);
    }

}