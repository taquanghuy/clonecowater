package com.pigllet.clonecowater.ultis.report;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class ReportResponse implements Parcelable{

    /**
     * data : {"id":26,"project_id":27,"name":"FY 18/19 - T:4,5,6","year":2018,"type":4,"status":3,"report_activity":[{"id":318,"report_id":26,"project_activity_id":740,"challenges_validate":"","project_activity":{"id":740,"project_id":27,"kqtt_id":865,"kqtg_id":859,"mtda_id":857,"project_result_id":865,"indicators":"[\"2367\"]","name":"HĐ 1.1.3.1. Tổ chức tham quan học tập vệ sinh môi trường và phát triển DLCĐ cho các hộ gia đình kinh doanh tiềm năng, người dân và các thành phần liên quan tại Thôn Sin Suối Hồ (Lai Châu)","status":1,"indicatorList":[{"id":2367,"project_id":27,"code":"DC25.GREAT.O142.","name":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","definition":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","measurement_type_beneficiary":1,"measurement_type_num_of":0,"measurement_type_qualitative":0,"target_number":"0","target_unit":0,"target_total":44,"target_women":0,"target_emw":0,"target_qualitative":null,"paf":0,"frequency":1,"indicator_id":23,"contractual_indicator":0,"basic_number":"0","basic_unit":null,"basic_total":0,"basic_women":0,"basic_emw":0,"basic_qualitative":null,"user_id":null,"status_end_of_program_target":0,"status_annual_target":0,"report_source":null,"key":0,"sum_annual_target_number":0,"sum_annual_target_women":70,"sum_annual_target_emw":70,"sum_annual_target_total":100,"sum_annual_target_qualitative":"","annual_targets":[{"id":1770,"project_indicator_id":2367,"year":2018,"target_number":"0","target_unit":0,"target_total":50,"target_women":40,"target_emw":40,"target_qualitative":""},{"id":1771,"project_indicator_id":2367,"year":2019,"target_number":"0","target_unit":0,"target_total":50,"target_women":30,"target_emw":30,"target_qualitative":""}]}]},"real_time":[{"id":55,"title":"Full 5","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 22:05:13"},{"id":58,"title":"Test date","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 13:38:00"}]}]}
     */

    private Data data;

    protected ReportResponse(Parcel in) {
        data = in.readParcelable(Data.class.getClassLoader());
    }

    public static final Creator<ReportResponse> CREATOR = new Creator<ReportResponse>() {
        @Override
        public ReportResponse createFromParcel(Parcel in) {
            return new ReportResponse(in);
        }

        @Override
        public ReportResponse[] newArray(int size) {
            return new ReportResponse[size];
        }
    };

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(data, flags);
    }

    public static class Data implements Parcelable{
        /**
         * id : 26
         * project_id : 27
         * name : FY 18/19 - T:4,5,6
         * year : 2018
         * type : 4
         * status : 3
         * report_activity : [{"id":318,"report_id":26,"project_activity_id":740,"challenges_validate":"","project_activity":{"id":740,"project_id":27,"kqtt_id":865,"kqtg_id":859,"mtda_id":857,"project_result_id":865,"indicators":"[\"2367\"]","name":"HĐ 1.1.3.1. Tổ chức tham quan học tập vệ sinh môi trường và phát triển DLCĐ cho các hộ gia đình kinh doanh tiềm năng, người dân và các thành phần liên quan tại Thôn Sin Suối Hồ (Lai Châu)","status":1,"indicatorList":[{"id":2367,"project_id":27,"code":"DC25.GREAT.O142.","name":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","definition":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","measurement_type_beneficiary":1,"measurement_type_num_of":0,"measurement_type_qualitative":0,"target_number":"0","target_unit":0,"target_total":44,"target_women":0,"target_emw":0,"target_qualitative":null,"paf":0,"frequency":1,"indicator_id":23,"contractual_indicator":0,"basic_number":"0","basic_unit":null,"basic_total":0,"basic_women":0,"basic_emw":0,"basic_qualitative":null,"user_id":null,"status_end_of_program_target":0,"status_annual_target":0,"report_source":null,"key":0,"sum_annual_target_number":0,"sum_annual_target_women":70,"sum_annual_target_emw":70,"sum_annual_target_total":100,"sum_annual_target_qualitative":"","annual_targets":[{"id":1770,"project_indicator_id":2367,"year":2018,"target_number":"0","target_unit":0,"target_total":50,"target_women":40,"target_emw":40,"target_qualitative":""},{"id":1771,"project_indicator_id":2367,"year":2019,"target_number":"0","target_unit":0,"target_total":50,"target_women":30,"target_emw":30,"target_qualitative":""}]}]},"real_time":[{"id":55,"title":"Full 5","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 22:05:13"},{"id":58,"title":"Test date","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 13:38:00"}]}]
         */

        private int id;
        private int project_id;
        private String name;
        private int year;
        private int type;
        private int status;
        private List<ReportActivity> report_activity;

        protected Data(Parcel in) {
            id = in.readInt();
            project_id = in.readInt();
            name = in.readString();
            year = in.readInt();
            type = in.readInt();
            status = in.readInt();
            report_activity = in.createTypedArrayList(ReportActivity.CREATOR);
        }

        public static final Creator<Data> CREATOR = new Creator<Data>() {
            @Override
            public Data createFromParcel(Parcel in) {
                return new Data(in);
            }

            @Override
            public Data[] newArray(int size) {
                return new Data[size];
            }
        };

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProject_id() {
            return project_id;
        }

        public void setProject_id(int project_id) {
            this.project_id = project_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<ReportActivity> getReport_activity() {
            return report_activity;
        }

        public void setReport_activity(List<ReportActivity> report_activity) {
            this.report_activity = report_activity;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(id);
            dest.writeInt(project_id);
            dest.writeString(name);
            dest.writeInt(year);
            dest.writeInt(type);
            dest.writeInt(status);
            dest.writeTypedList(report_activity);
        }

        public static class ReportActivity implements Parcelable{
            /**
             * id : 318
             * report_id : 26
             * project_activity_id : 740
             * challenges_validate :
             * project_activity : {"id":740,"project_id":27,"kqtt_id":865,"kqtg_id":859,"mtda_id":857,"project_result_id":865,"indicators":"[\"2367\"]","name":"HĐ 1.1.3.1. Tổ chức tham quan học tập vệ sinh môi trường và phát triển DLCĐ cho các hộ gia đình kinh doanh tiềm năng, người dân và các thành phần liên quan tại Thôn Sin Suối Hồ (Lai Châu)","status":1,"indicatorList":[{"id":2367,"project_id":27,"code":"DC25.GREAT.O142.","name":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","definition":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","measurement_type_beneficiary":1,"measurement_type_num_of":0,"measurement_type_qualitative":0,"target_number":"0","target_unit":0,"target_total":44,"target_women":0,"target_emw":0,"target_qualitative":null,"paf":0,"frequency":1,"indicator_id":23,"contractual_indicator":0,"basic_number":"0","basic_unit":null,"basic_total":0,"basic_women":0,"basic_emw":0,"basic_qualitative":null,"user_id":null,"status_end_of_program_target":0,"status_annual_target":0,"report_source":null,"key":0,"sum_annual_target_number":0,"sum_annual_target_women":70,"sum_annual_target_emw":70,"sum_annual_target_total":100,"sum_annual_target_qualitative":"","annual_targets":[{"id":1770,"project_indicator_id":2367,"year":2018,"target_number":"0","target_unit":0,"target_total":50,"target_women":40,"target_emw":40,"target_qualitative":""},{"id":1771,"project_indicator_id":2367,"year":2019,"target_number":"0","target_unit":0,"target_total":50,"target_women":30,"target_emw":30,"target_qualitative":""}]}]}
             * real_time : [{"id":55,"title":"Full 5","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 22:05:13"},{"id":58,"title":"Test date","report_activity_id":318,"province_id":0,"district_id":0,"commune_id":0,"village_id":0,"start_date":"2020-10-15 13:38:00"}]
             */

            private int id;
            private int report_id;
            private int project_activity_id;
            private String challenges_validate;
            private ProjectActivity project_activity;
            private List<RealTime> real_time;

            protected ReportActivity(Parcel in) {
                id = in.readInt();
                report_id = in.readInt();
                project_activity_id = in.readInt();
                challenges_validate = in.readString();
                project_activity = in.readParcelable(ProjectActivity.class.getClassLoader());
                real_time = in.createTypedArrayList(RealTime.CREATOR);
            }

            public static final Creator<ReportActivity> CREATOR = new Creator<ReportActivity>() {
                @Override
                public ReportActivity createFromParcel(Parcel in) {
                    return new ReportActivity(in);
                }

                @Override
                public ReportActivity[] newArray(int size) {
                    return new ReportActivity[size];
                }
            };

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getReport_id() {
                return report_id;
            }

            public void setReport_id(int report_id) {
                this.report_id = report_id;
            }

            public int getProject_activity_id() {
                return project_activity_id;
            }

            public void setProject_activity_id(int project_activity_id) {
                this.project_activity_id = project_activity_id;
            }

            public String getChallenges_validate() {
                return challenges_validate;
            }

            public void setChallenges_validate(String challenges_validate) {
                this.challenges_validate = challenges_validate;
            }

            public ProjectActivity getProject_activity() {
                return project_activity;
            }

            public void setProject_activity(ProjectActivity project_activity) {
                this.project_activity = project_activity;
            }

            public List<RealTime> getReal_time() {
                return real_time;
            }

            public void setReal_time(List<RealTime> real_time) {
                this.real_time = real_time;
            }

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(id);
                dest.writeInt(report_id);
                dest.writeInt(project_activity_id);
                dest.writeString(challenges_validate);
                dest.writeParcelable(project_activity, flags);
                dest.writeTypedList(real_time);
            }

            public static class ProjectActivity implements Parcelable{
                /**
                 * id : 740
                 * project_id : 27
                 * kqtt_id : 865
                 * kqtg_id : 859
                 * mtda_id : 857
                 * project_result_id : 865
                 * indicators : ["2367"]
                 * name : HĐ 1.1.3.1. Tổ chức tham quan học tập vệ sinh môi trường và phát triển DLCĐ cho các hộ gia đình kinh doanh tiềm năng, người dân và các thành phần liên quan tại Thôn Sin Suối Hồ (Lai Châu)
                 * status : 1
                 * indicatorList : [{"id":2367,"project_id":27,"code":"DC25.GREAT.O142.","name":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","definition":"(DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng","measurement_type_beneficiary":1,"measurement_type_num_of":0,"measurement_type_qualitative":0,"target_number":"0","target_unit":0,"target_total":44,"target_women":0,"target_emw":0,"target_qualitative":null,"paf":0,"frequency":1,"indicator_id":23,"contractual_indicator":0,"basic_number":"0","basic_unit":null,"basic_total":0,"basic_women":0,"basic_emw":0,"basic_qualitative":null,"user_id":null,"status_end_of_program_target":0,"status_annual_target":0,"report_source":null,"key":0,"sum_annual_target_number":0,"sum_annual_target_women":70,"sum_annual_target_emw":70,"sum_annual_target_total":100,"sum_annual_target_qualitative":"","annual_targets":[{"id":1770,"project_indicator_id":2367,"year":2018,"target_number":"0","target_unit":0,"target_total":50,"target_women":40,"target_emw":40,"target_qualitative":""},{"id":1771,"project_indicator_id":2367,"year":2019,"target_number":"0","target_unit":0,"target_total":50,"target_women":30,"target_emw":30,"target_qualitative":""}]}]
                 */

                private int id;
                private int project_id;
                private int kqtt_id;
                private int kqtg_id;
                private int mtda_id;
                private int project_result_id;
                private String indicators;
                private String name;
                private int status;
                private List<IndicatorList> indicatorList;

                protected ProjectActivity(Parcel in) {
                    id = in.readInt();
                    project_id = in.readInt();
                    kqtt_id = in.readInt();
                    kqtg_id = in.readInt();
                    mtda_id = in.readInt();
                    project_result_id = in.readInt();
                    indicators = in.readString();
                    name = in.readString();
                    status = in.readInt();
                    indicatorList = in.createTypedArrayList(IndicatorList.CREATOR);
                }

                public static final Creator<ProjectActivity> CREATOR = new Creator<ProjectActivity>() {
                    @Override
                    public ProjectActivity createFromParcel(Parcel in) {
                        return new ProjectActivity(in);
                    }

                    @Override
                    public ProjectActivity[] newArray(int size) {
                        return new ProjectActivity[size];
                    }
                };

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getProject_id() {
                    return project_id;
                }

                public void setProject_id(int project_id) {
                    this.project_id = project_id;
                }

                public int getKqtt_id() {
                    return kqtt_id;
                }

                public void setKqtt_id(int kqtt_id) {
                    this.kqtt_id = kqtt_id;
                }

                public int getKqtg_id() {
                    return kqtg_id;
                }

                public void setKqtg_id(int kqtg_id) {
                    this.kqtg_id = kqtg_id;
                }

                public int getMtda_id() {
                    return mtda_id;
                }

                public void setMtda_id(int mtda_id) {
                    this.mtda_id = mtda_id;
                }

                public int getProject_result_id() {
                    return project_result_id;
                }

                public void setProject_result_id(int project_result_id) {
                    this.project_result_id = project_result_id;
                }

                public String getIndicators() {
                    return indicators;
                }

                public void setIndicators(String indicators) {
                    this.indicators = indicators;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public List<IndicatorList> getIndicatorList() {
                    return indicatorList;
                }

                public void setIndicatorList(List<IndicatorList> indicatorList) {
                    this.indicatorList = indicatorList;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(id);
                    dest.writeInt(project_id);
                    dest.writeInt(kqtt_id);
                    dest.writeInt(kqtg_id);
                    dest.writeInt(mtda_id);
                    dest.writeInt(project_result_id);
                    dest.writeString(indicators);
                    dest.writeString(name);
                    dest.writeInt(status);
                    dest.writeTypedList(indicatorList);
                }

                public static class IndicatorList implements Parcelable{
                    /**
                     * id : 2367
                     * project_id : 27
                     * code : DC25.GREAT.O142.
                     * name : (DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng
                     * definition : (DC25) Số người tham quan học tập kinh nghiệm về vệ sinh môi trường phát triển DLCĐ tại một số địa phương tương đồng
                     * measurement_type_beneficiary : 1
                     * measurement_type_num_of : 0
                     * measurement_type_qualitative : 0
                     * target_number : 0
                     * target_unit : 0
                     * target_total : 44
                     * target_women : 0
                     * target_emw : 0
                     * target_qualitative : null
                     * paf : 0
                     * frequency : 1
                     * indicator_id : 23
                     * contractual_indicator : 0
                     * basic_number : 0
                     * basic_unit : null
                     * basic_total : 0
                     * basic_women : 0
                     * basic_emw : 0
                     * basic_qualitative : null
                     * user_id : null
                     * status_end_of_program_target : 0
                     * status_annual_target : 0
                     * report_source : null
                     * key : 0
                     * sum_annual_target_number : 0
                     * sum_annual_target_women : 70
                     * sum_annual_target_emw : 70
                     * sum_annual_target_total : 100
                     * sum_annual_target_qualitative :
                     * annual_targets : [{"id":1770,"project_indicator_id":2367,"year":2018,"target_number":"0","target_unit":0,"target_total":50,"target_women":40,"target_emw":40,"target_qualitative":""},{"id":1771,"project_indicator_id":2367,"year":2019,"target_number":"0","target_unit":0,"target_total":50,"target_women":30,"target_emw":30,"target_qualitative":""}]
                     */

                    private int id;
                    private int project_id;
                    private String code;
                    private String name;
                    private String definition;
                    private int measurement_type_beneficiary;
                    private int measurement_type_num_of;
                    private int measurement_type_qualitative;
                    private String target_number;
                    private int target_unit;
                    private int target_total;
                    private int target_women;
                    private int target_emw;
                    private Object target_qualitative;
                    private int paf;
                    private int frequency;
                    private int indicator_id;
                    private int contractual_indicator;
                    private String basic_number;
                    private Object basic_unit;
                    private int basic_total;
                    private int basic_women;
                    private int basic_emw;
                    private Object basic_qualitative;
                    private Object user_id;
                    private int status_end_of_program_target;
                    private int status_annual_target;
                    private Object report_source;
                    private int key;
                    private float sum_annual_target_number;
                    private int sum_annual_target_women;
                    private int sum_annual_target_emw;
                    private int sum_annual_target_total;
                    private String sum_annual_target_qualitative;
                    private List<AnnualTargets> annual_targets;

                    protected IndicatorList(Parcel in) {
                        id = in.readInt();
                        project_id = in.readInt();
                        code = in.readString();
                        name = in.readString();
                        definition = in.readString();
                        measurement_type_beneficiary = in.readInt();
                        measurement_type_num_of = in.readInt();
                        measurement_type_qualitative = in.readInt();
                        target_number = in.readString();
                        target_unit = in.readInt();
                        target_total = in.readInt();
                        target_women = in.readInt();
                        target_emw = in.readInt();
                        paf = in.readInt();
                        frequency = in.readInt();
                        indicator_id = in.readInt();
                        contractual_indicator = in.readInt();
                        basic_number = in.readString();
                        basic_total = in.readInt();
                        basic_women = in.readInt();
                        basic_emw = in.readInt();
                        status_end_of_program_target = in.readInt();
                        status_annual_target = in.readInt();
                        key = in.readInt();
                        sum_annual_target_number = in.readFloat();
                        sum_annual_target_women = in.readInt();
                        sum_annual_target_emw = in.readInt();
                        sum_annual_target_total = in.readInt();
                        sum_annual_target_qualitative = in.readString();
                        annual_targets = in.createTypedArrayList(AnnualTargets.CREATOR);
                    }

                    public static final Creator<IndicatorList> CREATOR = new Creator<IndicatorList>() {
                        @Override
                        public IndicatorList createFromParcel(Parcel in) {
                            return new IndicatorList(in);
                        }

                        @Override
                        public IndicatorList[] newArray(int size) {
                            return new IndicatorList[size];
                        }
                    };

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public int getProject_id() {
                        return project_id;
                    }

                    public void setProject_id(int project_id) {
                        this.project_id = project_id;
                    }

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getDefinition() {
                        return definition;
                    }

                    public void setDefinition(String definition) {
                        this.definition = definition;
                    }

                    public int getMeasurement_type_beneficiary() {
                        return measurement_type_beneficiary;
                    }

                    public void setMeasurement_type_beneficiary(int measurement_type_beneficiary) {
                        this.measurement_type_beneficiary = measurement_type_beneficiary;
                    }

                    public int getMeasurement_type_num_of() {
                        return measurement_type_num_of;
                    }

                    public void setMeasurement_type_num_of(int measurement_type_num_of) {
                        this.measurement_type_num_of = measurement_type_num_of;
                    }

                    public int getMeasurement_type_qualitative() {
                        return measurement_type_qualitative;
                    }

                    public void setMeasurement_type_qualitative(int measurement_type_qualitative) {
                        this.measurement_type_qualitative = measurement_type_qualitative;
                    }

                    public String getTarget_number() {
                        return target_number;
                    }

                    public void setTarget_number(String target_number) {
                        this.target_number = target_number;
                    }

                    public int getTarget_unit() {
                        return target_unit;
                    }

                    public void setTarget_unit(int target_unit) {
                        this.target_unit = target_unit;
                    }

                    public int getTarget_total() {
                        return target_total;
                    }

                    public void setTarget_total(int target_total) {
                        this.target_total = target_total;
                    }

                    public int getTarget_women() {
                        return target_women;
                    }

                    public void setTarget_women(int target_women) {
                        this.target_women = target_women;
                    }

                    public int getTarget_emw() {
                        return target_emw;
                    }

                    public void setTarget_emw(int target_emw) {
                        this.target_emw = target_emw;
                    }

                    public Object getTarget_qualitative() {
                        return target_qualitative;
                    }

                    public void setTarget_qualitative(Object target_qualitative) {
                        this.target_qualitative = target_qualitative;
                    }

                    public int getPaf() {
                        return paf;
                    }

                    public void setPaf(int paf) {
                        this.paf = paf;
                    }

                    public int getFrequency() {
                        return frequency;
                    }

                    public void setFrequency(int frequency) {
                        this.frequency = frequency;
                    }

                    public int getIndicator_id() {
                        return indicator_id;
                    }

                    public void setIndicator_id(int indicator_id) {
                        this.indicator_id = indicator_id;
                    }

                    public int getContractual_indicator() {
                        return contractual_indicator;
                    }

                    public void setContractual_indicator(int contractual_indicator) {
                        this.contractual_indicator = contractual_indicator;
                    }

                    public String getBasic_number() {
                        return basic_number;
                    }

                    public void setBasic_number(String basic_number) {
                        this.basic_number = basic_number;
                    }

                    public Object getBasic_unit() {
                        return basic_unit;
                    }

                    public void setBasic_unit(Object basic_unit) {
                        this.basic_unit = basic_unit;
                    }

                    public int getBasic_total() {
                        return basic_total;
                    }

                    public void setBasic_total(int basic_total) {
                        this.basic_total = basic_total;
                    }

                    public int getBasic_women() {
                        return basic_women;
                    }

                    public void setBasic_women(int basic_women) {
                        this.basic_women = basic_women;
                    }

                    public int getBasic_emw() {
                        return basic_emw;
                    }

                    public void setBasic_emw(int basic_emw) {
                        this.basic_emw = basic_emw;
                    }

                    public Object getBasic_qualitative() {
                        return basic_qualitative;
                    }

                    public void setBasic_qualitative(Object basic_qualitative) {
                        this.basic_qualitative = basic_qualitative;
                    }

                    public Object getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(Object user_id) {
                        this.user_id = user_id;
                    }

                    public int getStatus_end_of_program_target() {
                        return status_end_of_program_target;
                    }

                    public void setStatus_end_of_program_target(int status_end_of_program_target) {
                        this.status_end_of_program_target = status_end_of_program_target;
                    }

                    public int getStatus_annual_target() {
                        return status_annual_target;
                    }

                    public void setStatus_annual_target(int status_annual_target) {
                        this.status_annual_target = status_annual_target;
                    }

                    public Object getReport_source() {
                        return report_source;
                    }

                    public void setReport_source(Object report_source) {
                        this.report_source = report_source;
                    }

                    public int getKey() {
                        return key;
                    }

                    public void setKey(int key) {
                        this.key = key;
                    }

                    public float getSum_annual_target_number() {
                        return sum_annual_target_number;
                    }

                    public void setSum_annual_target_number(float sum_annual_target_number) {
                        this.sum_annual_target_number = sum_annual_target_number;
                    }

                    public int getSum_annual_target_women() {
                        return sum_annual_target_women;
                    }

                    public void setSum_annual_target_women(int sum_annual_target_women) {
                        this.sum_annual_target_women = sum_annual_target_women;
                    }

                    public int getSum_annual_target_emw() {
                        return sum_annual_target_emw;
                    }

                    public void setSum_annual_target_emw(int sum_annual_target_emw) {
                        this.sum_annual_target_emw = sum_annual_target_emw;
                    }

                    public int getSum_annual_target_total() {
                        return sum_annual_target_total;
                    }

                    public void setSum_annual_target_total(int sum_annual_target_total) {
                        this.sum_annual_target_total = sum_annual_target_total;
                    }

                    public String getSum_annual_target_qualitative() {
                        return sum_annual_target_qualitative;
                    }

                    public void setSum_annual_target_qualitative(String sum_annual_target_qualitative) {
                        this.sum_annual_target_qualitative = sum_annual_target_qualitative;
                    }

                    public List<AnnualTargets> getAnnual_targets() {
                        return annual_targets;
                    }

                    public void setAnnual_targets(List<AnnualTargets> annual_targets) {
                        this.annual_targets = annual_targets;
                    }

                    @Override
                    public int describeContents() {
                        return 0;
                    }

                    @Override
                    public void writeToParcel(Parcel dest, int flags) {
                        dest.writeInt(id);
                        dest.writeInt(project_id);
                        dest.writeString(code);
                        dest.writeString(name);
                        dest.writeString(definition);
                        dest.writeInt(measurement_type_beneficiary);
                        dest.writeInt(measurement_type_num_of);
                        dest.writeInt(measurement_type_qualitative);
                        dest.writeString(target_number);
                        dest.writeInt(target_unit);
                        dest.writeInt(target_total);
                        dest.writeInt(target_women);
                        dest.writeInt(target_emw);
                        dest.writeInt(paf);
                        dest.writeInt(frequency);
                        dest.writeInt(indicator_id);
                        dest.writeInt(contractual_indicator);
                        dest.writeString(basic_number);
                        dest.writeInt(basic_total);
                        dest.writeInt(basic_women);
                        dest.writeInt(basic_emw);
                        dest.writeInt(status_end_of_program_target);
                        dest.writeInt(status_annual_target);
                        dest.writeInt(key);
                        dest.writeFloat(sum_annual_target_number);
                        dest.writeInt(sum_annual_target_women);
                        dest.writeInt(sum_annual_target_emw);
                        dest.writeInt(sum_annual_target_total);
                        dest.writeString(sum_annual_target_qualitative);
                        dest.writeTypedList(annual_targets);
                    }

                    public static class AnnualTargets implements Parcelable{
                        /**
                         * id : 1770
                         * project_indicator_id : 2367
                         * year : 2018
                         * target_number : 0
                         * target_unit : 0
                         * target_total : 50
                         * target_women : 40
                         * target_emw : 40
                         * target_qualitative :
                         */

                        private int id;
                        private int project_indicator_id;
                        private int year;
                        private String target_number;
                        private int target_unit;
                        private int target_total;
                        private int target_women;
                        private int target_emw;
                        private String target_qualitative;

                        protected AnnualTargets(Parcel in) {
                            id = in.readInt();
                            project_indicator_id = in.readInt();
                            year = in.readInt();
                            target_number = in.readString();
                            target_unit = in.readInt();
                            target_total = in.readInt();
                            target_women = in.readInt();
                            target_emw = in.readInt();
                            target_qualitative = in.readString();
                        }

                        public static final Creator<AnnualTargets> CREATOR = new Creator<AnnualTargets>() {
                            @Override
                            public AnnualTargets createFromParcel(Parcel in) {
                                return new AnnualTargets(in);
                            }

                            @Override
                            public AnnualTargets[] newArray(int size) {
                                return new AnnualTargets[size];
                            }
                        };

                        public int getId() {
                            return id;
                        }

                        public void setId(int id) {
                            this.id = id;
                        }

                        public int getProject_indicator_id() {
                            return project_indicator_id;
                        }

                        public void setProject_indicator_id(int project_indicator_id) {
                            this.project_indicator_id = project_indicator_id;
                        }

                        public int getYear() {
                            return year;
                        }

                        public void setYear(int year) {
                            this.year = year;
                        }

                        public String getTarget_number() {
                            return target_number;
                        }

                        public void setTarget_number(String target_number) {
                            this.target_number = target_number;
                        }

                        public int getTarget_unit() {
                            return target_unit;
                        }

                        public void setTarget_unit(int target_unit) {
                            this.target_unit = target_unit;
                        }

                        public int getTarget_total() {
                            return target_total;
                        }

                        public void setTarget_total(int target_total) {
                            this.target_total = target_total;
                        }

                        public int getTarget_women() {
                            return target_women;
                        }

                        public void setTarget_women(int target_women) {
                            this.target_women = target_women;
                        }

                        public int getTarget_emw() {
                            return target_emw;
                        }

                        public void setTarget_emw(int target_emw) {
                            this.target_emw = target_emw;
                        }

                        public String getTarget_qualitative() {
                            return target_qualitative;
                        }

                        public void setTarget_qualitative(String target_qualitative) {
                            this.target_qualitative = target_qualitative;
                        }

                        @Override
                        public int describeContents() {
                            return 0;
                        }

                        @Override
                        public void writeToParcel(Parcel dest, int flags) {
                            dest.writeInt(id);
                            dest.writeInt(project_indicator_id);
                            dest.writeInt(year);
                            dest.writeString(target_number);
                            dest.writeInt(target_unit);
                            dest.writeInt(target_total);
                            dest.writeInt(target_women);
                            dest.writeInt(target_emw);
                            dest.writeString(target_qualitative);
                        }
                    }
                }
            }

            public static class RealTime implements Parcelable {
                /**
                 * id : 55
                 * title : Full 5
                 * report_activity_id : 318
                 * province_id : 0
                 * district_id : 0
                 * commune_id : 0
                 * village_id : 0
                 * start_date : 2020-10-15 22:05:13
                 * created_at : 2020-10-15 22:05:13
                 */

                private int id;
                private String title;
                private int report_activity_id;
                private int province_id;
                private int district_id;
                private int commune_id;
                private int village_id;
                private String start_date;
                private String created_at;

                protected RealTime(Parcel in) {
                    id = in.readInt();
                    title = in.readString();
                    report_activity_id = in.readInt();
                    province_id = in.readInt();
                    district_id = in.readInt();
                    commune_id = in.readInt();
                    village_id = in.readInt();
                    start_date = in.readString();
                    created_at = in.readString();
                }

                public static final Creator<RealTime> CREATOR = new Creator<RealTime>() {
                    @Override
                    public RealTime createFromParcel(Parcel in) {
                        return new RealTime(in);
                    }

                    @Override
                    public RealTime[] newArray(int size) {
                        return new RealTime[size];
                    }
                };

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getReport_activity_id() {
                    return report_activity_id;
                }

                public void setReport_activity_id(int report_activity_id) {
                    this.report_activity_id = report_activity_id;
                }

                public int getProvince_id() {
                    return province_id;
                }

                public void setProvince_id(int province_id) {
                    this.province_id = province_id;
                }

                public int getDistrict_id() {
                    return district_id;
                }

                public void setDistrict_id(int district_id) {
                    this.district_id = district_id;
                }

                public int getCommune_id() {
                    return commune_id;
                }

                public void setCommune_id(int commune_id) {
                    this.commune_id = commune_id;
                }

                public int getVillage_id() {
                    return village_id;
                }

                public void setVillage_id(int village_id) {
                    this.village_id = village_id;
                }

                public String getStart_date() {
                    return start_date;
                }

                public void setStart_date(String start_date) {
                    this.start_date = start_date;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                @Override
                public int describeContents() {
                    return 0;
                }

                @Override
                public void writeToParcel(Parcel dest, int flags) {
                    dest.writeInt(id);
                    dest.writeString(title);
                    dest.writeInt(report_activity_id);
                    dest.writeInt(province_id);
                    dest.writeInt(district_id);
                    dest.writeInt(commune_id);
                    dest.writeInt(village_id);
                    dest.writeString(start_date);
                    dest.writeString(created_at);
                }
            }
        }
    }
}
