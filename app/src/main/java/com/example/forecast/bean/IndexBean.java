package com.example.forecast.bean;

import java.util.List;

public class IndexBean {

    /**
     * results
     */
    private List<ResultsBean> results;

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * location
         */
        private LocationBean location;
        /**
         * suggestion
         */
        private SuggestionBean suggestion;
        /**
         * last_update
         */
        private String last_update;

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public SuggestionBean getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(SuggestionBean suggestion) {
            this.suggestion = suggestion;
        }

        public String getLast_update() {
            return last_update;
        }

        public void setLast_update(String last_update) {
            this.last_update = last_update;
        }

        public static class LocationBean {
            /**
             * id
             */
            private String id;
            /**
             * name
             */
            private String name;
            /**
             * country
             */
            private String country;
            /**
             * path
             */
            private String path;
            /**
             * timezone
             */
            private String timezone;
            /**
             * timezone_offset
             */
            private String timezone_offset;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCountry() {
                return country;
            }

            public void setCountry(String country) {
                this.country = country;
            }

            public String getPath() {
                return path;
            }

            public void setPath(String path) {
                this.path = path;
            }

            public String getTimezone() {
                return timezone;
            }

            public void setTimezone(String timezone) {
                this.timezone = timezone;
            }

            public String getTimezone_offset() {
                return timezone_offset;
            }

            public void setTimezone_offset(String timezone_offset) {
                this.timezone_offset = timezone_offset;
            }
        }

        public static class SuggestionBean {
            /**
             * ac
             */
            private AcBean ac;
            /**
             * air_pollution
             */
            private AirPollutionBean air_pollution;
            /**
             * airing
             */
            private AiringBean airing;
            /**
             * allergy
             */
            private AllergyBean allergy;
            /**
             * beer
             */
            private BeerBean beer;
            /**
             * boating
             */
            private BoatingBean boating;
            /**
             * car_washing
             */
            private CarWashingBean car_washing;
            /**
             * chill
             */
            private ChillBean chill;
            /**
             * comfort
             */
            private ComfortBean comfort;
            /**
             * dating
             */
            private DatingBean dating;
            /**
             * dressing
             */
            private DressingBean dressing;
            /**
             * fishing
             */
            private FishingBean fishing;
            /**
             * flu
             */
            private FluBean flu;
            /**
             * hair_dressing
             */
            private HairDressingBean hair_dressing;
            /**
             * kiteflying
             */
            private KiteflyingBean kiteflying;
            /**
             * makeup
             */
            private MakeupBean makeup;
            /**
             * mood
             */
            private MoodBean mood;
            /**
             * morning_sport
             */
            private MorningSportBean morning_sport;
            /**
             * night_life
             */
            private NightLifeBean night_life;
            /**
             * road_condition
             */
            private RoadConditionBean road_condition;
            /**
             * shopping
             */
            private ShoppingBean shopping;
            /**
             * sport
             */
            private SportBean sport;
            /**
             * sunscreen
             */
            private SunscreenBean sunscreen;
            /**
             * traffic
             */
            private TrafficBean traffic;
            /**
             * travel
             */
            private TravelBean travel;
            /**
             * umbrella
             */
            private UmbrellaBean umbrella;
            /**
             * uv
             */
            private UvBean uv;

            public AcBean getAc() {
                return ac;
            }

            public void setAc(AcBean ac) {
                this.ac = ac;
            }

            public AirPollutionBean getAir_pollution() {
                return air_pollution;
            }

            public void setAir_pollution(AirPollutionBean air_pollution) {
                this.air_pollution = air_pollution;
            }

            public AiringBean getAiring() {
                return airing;
            }

            public void setAiring(AiringBean airing) {
                this.airing = airing;
            }

            public AllergyBean getAllergy() {
                return allergy;
            }

            public void setAllergy(AllergyBean allergy) {
                this.allergy = allergy;
            }

            public BeerBean getBeer() {
                return beer;
            }

            public void setBeer(BeerBean beer) {
                this.beer = beer;
            }

            public BoatingBean getBoating() {
                return boating;
            }

            public void setBoating(BoatingBean boating) {
                this.boating = boating;
            }

            public CarWashingBean getCar_washing() {
                return car_washing;
            }

            public void setCar_washing(CarWashingBean car_washing) {
                this.car_washing = car_washing;
            }

            public ChillBean getChill() {
                return chill;
            }

            public void setChill(ChillBean chill) {
                this.chill = chill;
            }

            public ComfortBean getComfort() {
                return comfort;
            }

            public void setComfort(ComfortBean comfort) {
                this.comfort = comfort;
            }

            public DatingBean getDating() {
                return dating;
            }

            public void setDating(DatingBean dating) {
                this.dating = dating;
            }

            public DressingBean getDressing() {
                return dressing;
            }

            public void setDressing(DressingBean dressing) {
                this.dressing = dressing;
            }

            public FishingBean getFishing() {
                return fishing;
            }

            public void setFishing(FishingBean fishing) {
                this.fishing = fishing;
            }

            public FluBean getFlu() {
                return flu;
            }

            public void setFlu(FluBean flu) {
                this.flu = flu;
            }

            public HairDressingBean getHair_dressing() {
                return hair_dressing;
            }

            public void setHair_dressing(HairDressingBean hair_dressing) {
                this.hair_dressing = hair_dressing;
            }

            public KiteflyingBean getKiteflying() {
                return kiteflying;
            }

            public void setKiteflying(KiteflyingBean kiteflying) {
                this.kiteflying = kiteflying;
            }

            public MakeupBean getMakeup() {
                return makeup;
            }

            public void setMakeup(MakeupBean makeup) {
                this.makeup = makeup;
            }

            public MoodBean getMood() {
                return mood;
            }

            public void setMood(MoodBean mood) {
                this.mood = mood;
            }

            public MorningSportBean getMorning_sport() {
                return morning_sport;
            }

            public void setMorning_sport(MorningSportBean morning_sport) {
                this.morning_sport = morning_sport;
            }

            public NightLifeBean getNight_life() {
                return night_life;
            }

            public void setNight_life(NightLifeBean night_life) {
                this.night_life = night_life;
            }

            public RoadConditionBean getRoad_condition() {
                return road_condition;
            }

            public void setRoad_condition(RoadConditionBean road_condition) {
                this.road_condition = road_condition;
            }

            public ShoppingBean getShopping() {
                return shopping;
            }

            public void setShopping(ShoppingBean shopping) {
                this.shopping = shopping;
            }

            public SportBean getSport() {
                return sport;
            }

            public void setSport(SportBean sport) {
                this.sport = sport;
            }

            public SunscreenBean getSunscreen() {
                return sunscreen;
            }

            public void setSunscreen(SunscreenBean sunscreen) {
                this.sunscreen = sunscreen;
            }

            public TrafficBean getTraffic() {
                return traffic;
            }

            public void setTraffic(TrafficBean traffic) {
                this.traffic = traffic;
            }

            public TravelBean getTravel() {
                return travel;
            }

            public void setTravel(TravelBean travel) {
                this.travel = travel;
            }

            public UmbrellaBean getUmbrella() {
                return umbrella;
            }

            public void setUmbrella(UmbrellaBean umbrella) {
                this.umbrella = umbrella;
            }

            public UvBean getUv() {
                return uv;
            }

            public void setUv(UvBean uv) {
                this.uv = uv;
            }

            public static class AcBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class AirPollutionBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class AiringBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class AllergyBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class BeerBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class BoatingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class CarWashingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class ChillBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class ComfortBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class DatingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class DressingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class FishingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class FluBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class HairDressingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class KiteflyingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class MakeupBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class MoodBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class MorningSportBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class NightLifeBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class RoadConditionBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class ShoppingBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class SportBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class SunscreenBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class TrafficBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class TravelBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class UmbrellaBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }

            public static class UvBean {
                /**
                 * brief
                 */
                private String brief;
                /**
                 * details
                 */
                private String details;

                public String getBrief() {
                    return brief;
                }

                public void setBrief(String brief) {
                    this.brief = brief;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }
            }
        }
    }
}
