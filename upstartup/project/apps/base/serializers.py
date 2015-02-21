# coding: utf-8
from django.core.urlresolvers import reverse
from rest_framework import serializers
from .models import Startup


class StartUpSerializer(serializers.ModelSerializer):
	"""
	"""
	class Meta:
		model = Startup
