import DS from 'ember-data';

export default DS.Model.extend({
  title: DS.attr('string'),
  isbn: DS.attr('string'),
  comments: DS.attr('string'),
  categories: DS.attr(),
  seeAlso: DS.hasMany('book'  {inverse:null}),
});
