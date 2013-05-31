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
package fr.ybonnel.breizhcamppdf.model;

public class Talk {
    private String id;
    private String time;
    private String format;
    private String title;
    private String room;
    private String track;

    public String getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getFormat() {
        return format;
    }

    public String getTitle() {
        return title;
    }

    public String getRoom() {
        return room;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }
}