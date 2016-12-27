package org.mobiletrain.a8_2retrofit;

import java.util.List;

/**
 * Created by 王松 on 2016/8/9.
 */
public class CateBean {

    /**
     * status : true
     * tngou : [{"description":"养生保健","foodclass":0,"id":1,"keywords":"养生保健","name":"养生保健","seq":0,"title":"养生保健"},{"description":"癌症","foodclass":0,"id":58,"keywords":"癌症","name":"癌症","seq":0,"title":"癌症"},{"description":"男性","foodclass":0,"id":70,"keywords":"男性","name":"男性","seq":0,"title":"男性"},{"description":"女性","foodclass":0,"id":79,"keywords":"女性","name":"女性","seq":0,"title":"女性"},{"description":"呼吸道","foodclass":0,"id":85,"keywords":"呼吸道","name":"呼吸道","seq":0,"title":"呼吸道"},{"description":"心脏","foodclass":0,"id":103,"keywords":"心脏","name":"心脏","seq":0,"title":"心脏"},{"description":"神经系统","foodclass":0,"id":107,"keywords":"神经系统","name":"神经系统","seq":0,"title":"神经系统"},{"description":"肌肉骨骼","foodclass":0,"id":112,"keywords":"肌肉骨骼","name":"肌肉骨骼","seq":0,"title":"肌肉骨骼"},{"description":"其他","foodclass":0,"id":120,"keywords":"其他","name":"其他","seq":0,"title":"其他"},{"description":"美容减肥","foodclass":0,"id":148,"keywords":"美容减肥","name":"美容减肥","seq":0,"title":"美容减肥"},{"description":"孕前哺乳","foodclass":0,"id":171,"keywords":"孕前哺乳","name":"孕前哺乳","seq":0,"title":"孕前哺乳"},{"description":"经期","foodclass":0,"id":194,"keywords":"经期","name":"经期","seq":0,"title":"经期"},{"description":"肝胆脾胰","foodclass":0,"id":208,"keywords":"肝胆脾胰","name":"肝胆脾胰","seq":0,"title":"肝胆脾胰"},{"description":"五官","foodclass":0,"id":217,"keywords":"五官","name":"五官","seq":0,"title":"五官"},{"description":"血管","foodclass":0,"id":224,"keywords":"血管","name":"血管","seq":0,"title":"血管"}]
     */

    private boolean status;
    /**
     * description : 养生保健
     * foodclass : 0
     * id : 1
     * keywords : 养生保健
     * name : 养生保健
     * seq : 0
     * title : 养生保健
     */

    private List<TngouBean> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<TngouBean> getTngou() {
        return tngou;
    }

    public void setTngou(List<TngouBean> tngou) {
        this.tngou = tngou;
    }

    public static class TngouBean {
        private String description;
        private int foodclass;
        private int id;
        private String keywords;
        private String name;
        private int seq;
        private String title;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public int getFoodclass() {
            return foodclass;
        }

        public void setFoodclass(int foodclass) {
            this.foodclass = foodclass;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getKeywords() {
            return keywords;
        }

        public void setKeywords(String keywords) {
            this.keywords = keywords;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSeq() {
            return seq;
        }

        public void setSeq(int seq) {
            this.seq = seq;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
