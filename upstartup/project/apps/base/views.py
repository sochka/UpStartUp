from django.conf import settings
from django.http import HttpResponseRedirect
from django.contrib.auth import logout

from rest_framework import status, generics, viewsets
from rest_framework import filters

from .serializers import StartUpSerializer


def logout_user(request):
    """Logout User.
    """
    logout(request)
    return HttpResponseRedirect(settings.LOGOUTH_URL)


class StartUpList(generics.ListAPIView):
    # queryset = StartUp.objects.filter()
    serializer_class = StartUpSerializer
    paginate_by = 3
    paginate_by_param = 'page_size'
    max_paginate_by = 100
    filter_backends = (filters.OrderingFilter,)
    # ordering_fields = ('-pub_date',)
    # ordering = ('-pub_date',)

    def get_queryset(self):
        pass

    # def list(self, request, *args, **kwargs):
    #     return _list(self, request, *args, **kwargs)