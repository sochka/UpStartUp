# coding: utf-8
from django.core.urlresolvers import reverse
from rest_framework import serializers
# models here


class StartUpSerializer(serializers.ModelSerializer):
    pass


# class EntryTitleSerializer(serializers.ModelSerializer):
#     """EntryTitle serializer."""
#     title = serializers.CharField(source='title')
#     pub_date = serializers.DateTimeField(source='pub_date', format=None)
#     short_description = serializers.CharField(source='short_description')
#     get_absolute_url = serializers.SerializerMethodField('get_entrytitle_absolute_url')
#     post_image_small = serializers.Field(source='post_image_small')
#     post_image_big = serializers.Field(source='post_image_big')
#     # category
#     category_image = serializers.SerializerMethodField('get_category_image')
#     category_url = serializers.SerializerMethodField('get_category_url')
#     category_id = serializers.SerializerMethodField('get_category_id')
#     # recommendation
#     recommend_count = serializers.Field(source='recommend_count')
#     recommendation_entry = RecommendationSerializer(many=True)
#     # author
#     author_full_name = serializers.SerializerMethodField('get_author_full_name')
#     author_occupation = serializers.SerializerMethodField('get_author_occupation')
#     get_author_absolute_url = serializers.SerializerMethodField('author_absolute_url')
#     get_author_avatar = serializers.SerializerMethodField('author_avatar')
#     # other
#     get_comments_count = serializers.Field(source='get_comments_count')
#     posted_at = serializers.Field(source='posted_at')
#     get_views_count = serializers.Field(source='get_views_count')

#     class Meta:
#         model = EntryTitle
#         fields = ('id', 'title', 'pub_date', 'short_description', 'post_image_small',
#                   'post_image_big', 'category_image', 'category_url', 'recommend_count',
#                   'recommendation_entry', 'author', 'get_comments_count', 'posted_at',
#                   'get_views_count', 'get_absolute_url', 'get_author_absolute_url',
#                   'get_author_avatar', 'author_full_name', 'author_occupation')

#     def get_entrytitle_absolute_url(self, obj):
#         return obj.get_absolute_url

#     def get_category_image(self, obj):
#         return obj.category.category.image

#     def get_category_url(self, obj):
#         return '?category=' + obj.category.get_url()

#     def get_category_id(self, obj):
#         return obj.category.id

#     def get_author_full_name(self, obj):
#         if obj.author:
#             return obj.author.author_full_name
#         else:
#             return ""

#     def get_author_occupation(self, obj):
#         try:
#             occupation = obj.author.occupation
#         except:
#             occupation = ''
#         return occupation or ''

#     def author_absolute_url(self, obj):
#         return obj.author.get_absolute_url() if obj.author else ''

#     def author_avatar(self, obj):
#         return obj.author.get_avatar if obj.author else ''
