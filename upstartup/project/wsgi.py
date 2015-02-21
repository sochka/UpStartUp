"""
WSGI config for UpStartUp project.

For more information on this file, see
https://docs.djangoproject.com/en/1.6/howto/deployment/wsgi/
"""

import os

_PROJECT_DIR = os.path.dirname(os.path.dirname(os.path.abspath(__file__)))
_PROJECT_NAME = _PROJECT_DIR.split('/')[-1]

os.environ.setdefault("DJANGO_SETTINGS_MODULE", "{0}.settings.production".format(_PROJECT_NAME))

from django.core.wsgi import get_wsgi_application
application = get_wsgi_application()
