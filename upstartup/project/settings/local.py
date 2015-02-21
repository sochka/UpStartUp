"""
Django DEVELOPMENT settings and globals for ALL sites.
"""

from __future__ import absolute_import

from os.path import join, normpath

from .base import *


DEBUG = True

TEMPLATE_DEBUG = DEBUG


ALLOWED_HOSTS = ['localhost', ]


SECRET_KEY = '!1y9m_%mg@hokoq5q5&74=gxi+ny5gc^j!b0_x%qwtg(n4jsw('


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/1.6/howto/static-files/

STATIC_ROOT = u'%s' % join(DJANGO_PROJECT_ROOT, 'static')

# https://docs.djangoproject.com/en/dev/ref/settings/#media-root

MEDIA_ROOT = u'%s' % join(DJANGO_PROJECT_ROOT, 'media')


# Database
# https://docs.djangoproject.com/en/1.6/ref/settings/#databases

DATABASES = {
    'default': {
        'ENGINE': 'django.db.backends.sqlite3',
        'NAME': join(DJANGO_PROJECT_ROOT, 'upstartup.sqlite3'),
    }
}


# CACHES
CACHES = {
    'default': {
        'BACKEND': 'django.core.cache.backends.dummy.DummyCache',
   }
}


# EMAIL CONFIGURATION
EMAIL_BACKEND = 'django.core.mail.backends.smtp.EmailBackend'
EMAIL_HOST = 'smtp.gmail.com'
EMAIL_PORT = 587
EMAIL_USE_TLS = True

EMAIL_HOST_USER = 'developerium@gmail.com'
EMAIL_HOST_PASSWORD = 'zaizu$kosiat4travy'
