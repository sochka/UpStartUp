# -*- coding: utf-8 -*-

from django.contrib import admin
from django.contrib.admin.sites import site

from .models import Startup

admin.site.register(Startup)
