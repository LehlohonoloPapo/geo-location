# to use the geopy library  pip install geopy
from geopy.geocoders import Nominatim
from pprint import pprint

def getLoc(city):
    app = Nominatim(user_agent="Location")
    location = app.geocode(city).raw
    pprint(location)
getLoc("Pretoria")
