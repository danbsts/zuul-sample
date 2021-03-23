FROM python:3.7
WORKDIR /app
COPY requirements.txt .
RUN pip install -r requirements.txt
COPY . /app
ENTRYPOINT [ "python" ]
CMD [ "-m", "flask", "run", "--host", "0.0.0.0", "--port", "8080" ]
