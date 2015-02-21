"""
BASE Django SETTINGS and globals

For more information on this file, see
https://docs.djangoproject.com/en/1.6/topics/settings/

For the full list of settings and their values, see
https://docs.djangoproject.com/en/1.6/ref/settings/
"""

# Build paths inside the project like this: os.path.join(BASE_DIR, ...)
# from __future__ import absolute_import

from os.path import dirname, join, abspath

from django.utils.translation import ugettext_lazy as _


BASE_DIR = dirname(dirname(__file__))


# DJANGO_PROJECT_ROOT (manage.py)
DJANGO_PROJECT_ROOT = dirname(dirname(dirname(__file__)))


# Quick-start development settings - unsuitable for production
# See https://docs.djangoproject.com/en/1.6/howto/deployment/checklist/


# SECURITY WARNING: don't run with debug turned on in production!

DEBUG = False

TEMPLATE_DEBUG = DEBUG


# See: https://docs.djangoproject.com/en/dev/ref/settings/#admins

ADMINS = (
    ('Vladyslav Ishchenko', 'ischenkovn@gmail.com'),
)

# See: https://docs.djangoproject.com/en/dev/ref/settings/#managers

MANAGERS = ADMINS


SITE_ID = 1


# Custom User
AUTH_USER_MODEL = 'auth.User'

LOGOUTH_URL = '/'

ALLOWED_HOSTS = ['*']

# Application definition
# https://docs.djangoproject.com/en/dev/ref/settings/#installed-apps

INSTALLED_APPS = (
    # Packages before django.

    # Django contrib
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.sites',
    'django.contrib.messages',
    'django.contrib.staticfiles',

    # Core packages

    # Utils Django packages
    'crispy_forms',               # Forms http://django-crispy-forms.readthedocs.org/en/latest/install.html
    'south',
    'rest_framework',
    # Inage galery:
    'adminsortable',
    # Develop packages
    # 'project.apps.filebrowser',
    'project.apps.base',
)

# https://docs.djangoproject.com/en/dev/ref/settings/#middleware-classes

MIDDLEWARE_CLASSES = (
    'django.contrib.sessions.middleware.SessionMiddleware',
    'django.middleware.csrf.CsrfViewMiddleware',
    'django.contrib.auth.middleware.AuthenticationMiddleware',
    'django.contrib.messages.middleware.MessageMiddleware',
    'django.middleware.locale.LocaleMiddleware',
    'django.middleware.doc.XViewMiddleware',
    'django.middleware.common.CommonMiddleware',
)

ROOT_URLCONF = 'project.urls'

WSGI_APPLICATION = 'project.wsgi.application'


# Internationalization
# https://docs.djangoproject.com/en/1.6/topics/i18n/

LANGUAGE_CODE = 'en'

TIME_ZONE = 'UTC'

USE_I18N = True

USE_L10N = False

USE_TZ = True


# Static files (CSS, JavaScript, Images)
# https://docs.djangoproject.com/en/1.6/howto/static-files/

STATIC_URL = '/static/'


# https://docs.djangoproject.com/en/dev/ref/settings/#media-url

MEDIA_URL = '/media/'


# https://docs.djangoproject.com/en/dev/ref/contrib/staticfiles/#staticfiles-finders

STATICFILES_FINDERS = (
    'django.contrib.staticfiles.finders.FileSystemFinder',
    'django.contrib.staticfiles.finders.AppDirectoriesFinder',
)


# https://docs.djangoproject.com/en/dev/ref/contrib/staticfiles/#std:setting-STATICFILES_DIRS

STATICFILES_DIRS = (
    u'{0}/{1}'.format(DJANGO_PROJECT_ROOT, 'frontend'),
)


# https://docs.djangoproject.com/en/dev/ref/settings/#template-context-processors

TEMPLATE_CONTEXT_PROCESSORS = (
    'django.contrib.auth.context_processors.auth',
    'django.contrib.messages.context_processors.messages',
    'django.core.context_processors.i18n',
    'django.core.context_processors.request',
    'django.core.context_processors.media',
    'django.core.context_processors.static'
)


# https://docs.djangoproject.com/en/dev/ref/settings/#template-loaders

TEMPLATE_LOADERS = (
    'django.template.loaders.filesystem.Loader',
    'django.template.loaders.app_directories.Loader',
)

# https://docs.djangoproject.com/en/dev/ref/settings/#template-dirs

TEMPLATE_DIRS = (
    join(DJANGO_PROJECT_ROOT, 'project/templates'),
)


LOCALE_PATHS = (
    join(DJANGO_PROJECT_ROOT, '/locale'),
)



# python-social-auth

AUTHENTICATION_BACKENDS = (
    'django.contrib.auth.backends.ModelBackend',
)


LANGUAGES = (
    ('en', _('English')),
    ('ru', _('Russa')),
)


# SETTING FOR crispy_forms
CRISPY_TEMPLATE_PACK = 'bootstrap3'
