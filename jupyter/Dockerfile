FROM jupyter/datascience-notebook

CMD ["jupyter", "notebook", "-y", "--generate-config"]
#CMD ["echo", '"c.NotebookApp.token = ''"', ">>", "/home/jovyan/.jupyter/jupyter_notebook_config.py"]
CMD ["jupyter", "notebook", "--no-browser","--NotebookApp.token=''","--NotebookApp.password=''","--port=8887"]
#CMD [echo "c.NotebookApp.password = u''" >> /home/jovyan/.jupyter/jupyter_notebook_config.py
#CMD [echo "c.NotebookApp.open_browser = True" >> /home/jovyan/.jupyter/jupyter_notebook_config.py
#CMD [echo "c.NotebookApp.ip = 'localhost'" >> /home/jovyan/.jupyter/jupyter_notebook_config.py
    