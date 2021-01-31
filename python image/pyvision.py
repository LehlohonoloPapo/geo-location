import cv2
import sys

cascpath = "haarcascade_FrontalFace_defaul.xml"
faceCascade = cv2.CascadeClassifier(cascpath)
video_capture= cv2.VideoCapture(0)

while True:
    ret, frame = video_capture.read()
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    faces =faceCascade.detectMultiscale