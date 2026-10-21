import{z as i,L as e,ak as t,h as s}from"./952f98a9.js";import"./7f3d7ca9.js";import{x as o}from"./216055dc.js";var n=i`:host {
  display: block;
  box-sizing: border-box;
}

:host([hidden]), [hidden] {
  display: none !important;
}

*, *:before, *:after {
  box-sizing: inherit;
}
`;customElements.define("bbva-type-icon",o);class r extends e{static get is(){return"bbva-aggregation-clip-list"}static get properties(){return{itemList:{type:Array}}}constructor(){super(),this.itemList=[]}static get styles(){return[n,t("bbva-aggregation-clip-list-shared-styles")]}render(){return s`
      <slot></slot>
      ${this.itemList.map((i=>s`
        <bbva-list-clip id="${i.id}" heading="${i.id}" .headingLevel="${i.level}" .noLink="${i.noLink}" .badgeText="${i.badgeText}" .badgeType="${i.badgeType}"  @list-clip-link-click="${()=>this.clickSelectionOption(i)}">
        ${"icon"===i.renderFlag?s`<bbva-type-icon id="icon" slot="image" icon=${i.icon} size="${i.size}" icon-color="${i.color}"></bbva-type-icon>`:""}
        ${"micro"===i.renderFlag?s`<span id="micro" slot="image">${i.microillustration}</span>`:""}
        ${"url"===i.renderFlag?s`<img id="url" slot="image" src="${i.img}" alt="${i.id}">`:""}
            ${i.description}
        </bbva-list-clip>
        <bbva-divider></bbva-divider>
      `))}
    `}clickSelectionOption(i){this._fireEvent("notification-option-selected",i)}_fireEvent(i,e){this.dispatchEvent(new CustomEvent(i,{detail:e,bubbles:!0,composed:!0}))}}customElements.define(r.is,r);
